package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ToListOfWords {

    public static List<String> toListOWords(List<TextFile> stringsList){
        List<String> result = new ArrayList<>();
        StringTokenizer tokenizer ;
        for (int i = 0; i < stringsList.size(); i++) {

            tokenizer = new StringTokenizer(stringsList.get(i).getLine()," ,.()");

            while (tokenizer.hasMoreTokens()){
                result.add(tokenizer.nextToken());
            }


        }

        return result;
    }
}
