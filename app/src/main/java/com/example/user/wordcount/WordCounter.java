package com.example.user.wordcount;

public class WordCounter {
    public int count(String words) {
        return words.split(" ").length;
    }
}
