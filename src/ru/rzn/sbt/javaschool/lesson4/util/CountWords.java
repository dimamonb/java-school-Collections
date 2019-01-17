package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {

    public static void countWordsInFile(List<TextFile> file){
        List<String> listItem = new ArrayList<>();

        for(TextFile item: file){
            listItem.add(item.getLine());
        }

        ArrayList<String>[][] result = null;

        for(String w: listItem){
            String[] word = w.split("\\s+");
            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);
            }

        }
    }
}
