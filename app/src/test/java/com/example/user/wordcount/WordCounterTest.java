package com.example.user.wordcount;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {

    @Test
    public void canCountThreeWords() {
        WordCounter words = new WordCounter();
        assertEquals(3, words.count("I love you"));
    }

    @Test
    public void canCountOneWord() {
        WordCounter words = new WordCounter();
        assertEquals(1, words.count("Bananas"));
    }
}