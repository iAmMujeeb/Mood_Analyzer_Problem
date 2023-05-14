package com.bridgelabz;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        String[] messageArr = null;
        String mood = null;
        messageArr = message.split(" ");
        for (int i = 0; i < messageArr.length; i++) {
            if ((messageArr[i].equals("Happy"))||(messageArr[i].equals("Any"))) {
                mood = "Happy";
                break;
            }if (messageArr[i].equals("Sad")) {
                mood = "Sad";
                break;
            }
            if (messageArr[i].equals(null)){
                try {
                    throw new InvalidMoodException();
                }catch (Exception | InvalidMoodException e){
                    mood = "Happy";
                    break;
                }
            }
        }
        return mood;
    }
}
