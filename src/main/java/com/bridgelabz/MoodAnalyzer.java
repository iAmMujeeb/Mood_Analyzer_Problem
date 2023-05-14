package com.bridgelabz;

public class MoodAnalyzer {

    public String analyzeMood(String message) {
        String mood = null;
        String[] messageArr = message.split(" ");
        for (int i = 0; i < messageArr.length; i++) {
            if ((messageArr[i].equals("Happy"))||(messageArr[i].equals("Any"))) {
                mood = "Happy";
                break;
            }else
                mood = "Sad";
        }
        return mood;
    }
}
