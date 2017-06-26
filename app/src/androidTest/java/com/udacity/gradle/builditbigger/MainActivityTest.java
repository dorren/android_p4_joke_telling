package com.udacity.gradle.builditbigger;


import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.dorren.joke.ui.JokeActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;


@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    private IdlingResource mIdlingResource;


    // Registers any resource that needs to be synchronized with Espresso before the test is run.
    @Before
    public void registerIdlingResource() {
        mIdlingResource = mActivityTestRule.getActivity().getIdlingResource();;
        // To prove that the test fails, omit this call:
        Espresso.registerIdlingResources(mIdlingResource);

        Intents.init();   // for testing activity transitions
    }

    @Test
    public void checkLoading() {
        String target = TestHelper.getResourceString(R.string.instructions);

        onView(withText(target)).check(matches(isDisplayed()));

    }

    @Test
    public void clickBtn() {
        String btnText = TestHelper.getResourceString(R.string.button_text);
        onView(withText(btnText)).perform(click());

        // should be on JokeActivity
        intended(hasComponent(JokeActivity.class.getName()));

        String target = TestHelper.getResourceString(R.string.joke_title);
        onView(withText(target)).check(matches(isDisplayed()));
    }

    // Remember to unregister resources when not needed to avoid malfunction.
    @After
    public void unregisterIdlingResource() {
        if (mIdlingResource != null) {
            Espresso.unregisterIdlingResources(mIdlingResource);
        }

        Intents.release();
    }
}