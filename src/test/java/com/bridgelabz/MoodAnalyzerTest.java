package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessageShouldReturnMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualMood = moodAnalyzer.analyzeMood("Happy");
        Assertions.assertEquals("Happy", actualMood);
    }

}