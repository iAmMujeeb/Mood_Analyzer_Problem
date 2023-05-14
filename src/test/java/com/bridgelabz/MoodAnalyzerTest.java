package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessageShouldReturnMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String actualMood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("Happy", actualMood);
    }

}
