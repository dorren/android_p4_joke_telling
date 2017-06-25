package com.dorren.joke.source;

import java.util.Random;

public class JokeSource {
    private static final String[] jokes = new String[]{
        "Just changed my Facebook name to 'No one' so when I see stupid posts I can click like and it will say 'No one likes this'.",
        "What's the difference between snowmen and snowladies? Snowballs",
        "What do you call a bear with no teeth? -- A gummy bear!",
        "How do you seduce a fat woman? Piece of cake.",
        "When a man opens the car door for his wife, you can be sure of one thing, either the car is new or the wife is.",
        "Women are like roads. The more curves they have, the more dangerous they are.",
        "The sole purpose of a child's middle name is so they can tell when they're really in trouble.",
        "What's 6 inches long, has a head on it and drives women crazy? $100 bill",
        "When my boss asked me who is the stupid one, me or him? I told him everyone knows he doesn't hire stupid people.",
        "The first half of our lives is ruined by our parents, and the second half by our children.",
        "How does a man show that he's planning for the future? He buys two cases of beer instead of one.",
        "Wife says to her programmer husband, Go to the store and buy a loaf of bread. " +
            "If they have eggs, buy a dozen. Husband returns with 12 loaves of bread."
    };

    public static String tellAjoke() {
        int length = jokes.length;
        int index = new Random().nextInt(length);
        return jokes[index];
    }
}
