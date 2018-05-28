package com.example.user.wordcount;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {

    @Test
    public void canCountThreeWords() {
        assertEquals(3, WordCounter.count("I love you"));
    }

    @Test
    public void canCountOneWord() {
        assertEquals(1, WordCounter.count("Bananas"));
    }

    @Test
    public void canCountZeroWords() {
        assertEquals(0, WordCounter.count(""));
    }
}