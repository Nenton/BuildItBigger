package com.nenton.javajokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {
    private List<String> jokes = getJokes();

    private List<String> getJokes() {
        List<String> strings = new ArrayList<>();
        strings.add("This is totally a funny joke");
        strings.add("Q: What do lawyers use as contraceptives?\n" +
                "\n" +
                "A: Their personalities.");
        strings.add("From the Roast of David Hasselhoff: Of course all of Seth's cartoons are on FOX. " +
                "I also love that AIDS documentary they've been showing. You been watching? It's called 'Glee.'");
        strings.add("Boxers don't have sex before a fight. Do you know why that is? They don't fancy each other.");
        strings.add("Bob: \"I just got a new set of golf clubs for my wife.\"\n" +
                "\n" +
                "Jim: \"Great trade!\"");
        return strings;
    }

    public String getJoke() {
        int numberJoke = new Random().nextInt(jokes.size() - 1);
        return jokes.get(numberJoke);
    }
}
