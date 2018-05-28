package com.example.user.wordcount;

public class WordCounter {
    public static int count(String words) {
        if (words.length() == 0) {
            return 0;
        }

        return words.split(" ").length;
    }
}
