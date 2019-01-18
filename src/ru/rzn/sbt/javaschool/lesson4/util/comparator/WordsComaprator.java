package ru.rzn.sbt.javaschool.lesson4.util.comparator;

import ru.rzn.sbt.javaschool.lesson4.entity.WordsProcessing;

import java.util.Comparator;

public class WordsComaprator implements Comparator<WordsProcessing> {

    @Override
    public int compare(WordsProcessing s1, WordsProcessing s2) {
        if (s1.getWord().length() > s2.getWord().length()) {
            return 1;
        } else if (s1.getWord().length() < s2.getWord().length()) {
            return -1;
        }
        return s1.getWord().compareTo(s2.getWord());
    }
}
