package ru.otus;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloOtus {

    private static final Logger LOGGER = Logger.getLogger(HelloOtus.class.getName());

    public static void main(String[] args) {
        List<Integer> example = new ArrayList<>();
        int min = 0;
        int max = 10;
        for (int i = min; i < max; i++) {
            example.add(i);
        }

        LOGGER.log(Level.INFO, "Reversed array: {0}", Lists.reverse(example));

    }
}
