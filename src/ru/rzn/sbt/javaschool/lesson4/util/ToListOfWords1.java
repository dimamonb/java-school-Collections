package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFileEntity;
import ru.rzn.sbt.javaschool.lesson4.entity.WordsEntity;

import java.util.*;

public class ToListOfWords1 {

    public static List<WordsEntity> toListOWords1(List<TextFileEntity> stringsList) {
        List<WordsEntity> result = new ArrayList<>();

        for (int i = 0; i < stringsList.size(); i++) {

            String[] temp = stringsList.get(i).getLine().replaceAll("[a-zA-Z0-9)(]", "").split("[.,\\s]+");
            for(String s: temp)
                result.add( new WordsEntity(s));

        }

        return result;
    }


}

