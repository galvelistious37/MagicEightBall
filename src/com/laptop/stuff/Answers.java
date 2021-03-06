package com.laptop.stuff;

import java.util.HashMap;
import java.util.Map;

public class Answers {
    private final Map<Integer, String[]> eightBallAnswers;

    public Answers() {
        this.eightBallAnswers = buildEightBallAnswers();
    }

    Map<Integer, String[]> buildEightBallAnswers(){
        Map<Integer, String[]> createAnswers = new HashMap<Integer, String[]>();
        createAnswers.putAll(populateShittyAnswers());
        createAnswers.putAll(populateNeutralAnswers());
        createAnswers.putAll(populateGoodAnswers());
        return createAnswers;
    }

    public Map<Integer, String[]> getEightBallAnswers() {
        return eightBallAnswers;
    }

    Map<Integer, String[]> populateShittyAnswers(){
        Map<Integer, String[]> createAnswers = new HashMap<Integer, String[]>();
        createAnswers.put(1, "Hell Nah".split(" "));
        createAnswers.put(2, "Nope, don't even plan on it".split(" "));
        createAnswers.put(3, "Yeah... and by yeah, I mean no".split(" "));
        return createAnswers;
    }

    Map<Integer, String[]> populateNeutralAnswers(){
        Map<Integer, String[]> createAnswers = new HashMap<Integer, String[]>();
        createAnswers.put(4, "Eh... Maybe".split(" "));
        createAnswers.put(5, "Ask me when I'm not drunk".split(" "));
        createAnswers.put(6, "I don't know".split(" "));
        return createAnswers;
    }

    Map<Integer, String[]> populateGoodAnswers(){
        Map<Integer, String[]> createAnswers = new HashMap<Integer, String[]>();
        createAnswers.put(7, "Yup".split(" "));
        createAnswers.put(8, "Hell Yeeeeaaaaahhhhh".split(" "));
        createAnswers.put(9, "Yup yup yup".split(" "));
        createAnswers.put(10, "Only if Ruby says yes".split(" "));
        createAnswers.put(11, "Fo' Sho' Baws".split(" "));
        createAnswers.put(12, "Myeah".split(" "));
        return createAnswers;
    }
}
