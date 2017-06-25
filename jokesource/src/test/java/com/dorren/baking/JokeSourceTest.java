package com.dorren.baking;

import com.dorren.joke.source.JokeSource;

import org.junit.Test;

import sun.rmi.runtime.Log;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class JokeSourceTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void tell_a_joke(){
        String joke = JokeSource.tellAjoke();
        assertNotNull(joke);
    }
}