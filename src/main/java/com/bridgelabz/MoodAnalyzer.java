package com.bridgelabz;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
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
