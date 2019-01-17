package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;

import java.security.Key;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {

    private Map<String, Integer> result = new HashMap<>();

    public void countWordsInFile(List<TextFile> file, String ...params){
//        if(params == null){return;}
        List<String> listItem;

        Integer counter;

        listItem = ToListOfWords.toListOWords(file);

        for (String s: listItem){
            if(!result.containsKey(s)) {
                result.put(s, 1);
            }
            else {
                counter = result.get(s);
                result.put(s, counter+1);
            }
        }
        for (String key: result.keySet()) {
            System.out.println(key + " - " + result.get(key));
        }
    }


}
