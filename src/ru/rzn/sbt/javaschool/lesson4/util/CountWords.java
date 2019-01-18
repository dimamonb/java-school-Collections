package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFileEntity;
import ru.rzn.sbt.javaschool.lesson4.entity.WordsEntity;

import java.util.*;

public class CountWords {

    private Map<String, Integer> result = new HashMap<>();

    public void countWordsInFile(List<TextFileEntity> file, String ...params){
//        if(params == null){return;}
        List<WordsEntity> listItem;

        Integer counter;

        listItem = ToListOfWords1.toListOWords1(file);

        for (WordsEntity s: listItem){
            if(!result.containsKey(s.getWord())) {
                result.put(s.getWord(), 1);
            }
            else {
                counter = result.get(s.getWord());
                result.put(s.getWord(), counter+1);
            }
        }
        for (String key: result.keySet()) {
            System.out.println(key + " - " + result.get(key));
        }
    }


}
