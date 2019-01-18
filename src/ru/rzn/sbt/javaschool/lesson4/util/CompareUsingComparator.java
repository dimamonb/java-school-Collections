package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.WordsEntity;
import ru.rzn.sbt.javaschool.lesson4.util.comparator.WordsComaprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareUsingComparator {
    public static List<WordsEntity> comp(List<WordsEntity> wp){
        List<WordsEntity> result = new ArrayList<>(wp);
        Collections.sort(result, new WordsComaprator());
        return result;
    }
}
