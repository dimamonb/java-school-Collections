package ru.rzn.sbt.javaschool.lesson4.util.comparator;

import ru.rzn.sbt.javaschool.lesson4.entity.WordsEntity;

import java.util.Comparator;

public class WordsComaprator implements Comparator<WordsEntity> {

    @Override
    public int compare(WordsEntity s1, WordsEntity s2) {
        if (s1.getWord().length() > s2.getWord().length()) {
            return 1;
        } else if (s1.getWord().length() < s2.getWord().length()) {
            return -1;
        }
        return s1.getWord().compareTo(s2.getWord());
    }
}
