package com.dorren.joke.backend;

import com.dorren.joke.source.JokeSource;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {

    private String mJoke;

    public String getData() {
        return mJoke;
    }

    public void setJoke() {
        mJoke = JokeSource.tellAjoke();
    }
}