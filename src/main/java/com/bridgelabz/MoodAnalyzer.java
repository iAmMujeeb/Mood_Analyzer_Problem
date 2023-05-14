package com.bridgelabz;

public class MoodAnalyzer {
    public String analyzeMood(String message) {
        String mood = null;
        String[] messageArr = message.split(" ");
        for (int i = 0; i < messageArr.length; i++) {
            if (messageArr[i].equals("Happy"))
                mood = "Happy";
            else
                mood = "Sad";
        }
        return mood;
    }
}
