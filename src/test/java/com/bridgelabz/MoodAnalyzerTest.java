package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessageShouldReturnMood() {
        String actualMood = null;
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            actualMood = moodAnalyzer.analyzeMood();
        }catch (Exception e){
            System.out.println(e);
        }
        Assertions.assertEquals(null, actualMood);
    }

}
