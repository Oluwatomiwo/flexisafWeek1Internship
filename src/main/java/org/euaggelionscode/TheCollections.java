package org.euaggelionscode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TheCollections {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Shoes");
        words.add("Bags");
        words.add("Clothes");
        words.add("WristWatches");
        words.add("Hats");

        System.out.println("Property List: " + words);

        removeWord(words, "Clothes");


    }

    private static void removeWord(List<String> list, String wordToRemove) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(wordToRemove)) {
                iterator.remove();
            }
        }
    }

}
