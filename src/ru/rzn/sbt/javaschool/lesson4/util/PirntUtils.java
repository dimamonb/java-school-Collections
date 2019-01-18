package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFileEntity;
import ru.rzn.sbt.javaschool.lesson4.entity.WordsEntity;

import java.util.*;

public class PirntUtils {

    public static void pirntForward(List<TextFileEntity> file){
        ListIterator<TextFileEntity> lit = file.listIterator();
        while (lit.hasNext()){
            TextFileEntity item = lit.next();
            System.out.println(item.getPos() + " " + item.getLine());
        }
    }

    public static void pirntBackward(List<TextFileEntity> file){
        ListIterator<TextFileEntity> lit = file.listIterator(file.size());

        while (lit.hasPrevious()){
            TextFileEntity item = lit.previous();
            System.out.println(item.getPos() + " " + item.getLine());
        }
    }

    public static void pirntWords(List<WordsEntity> words){
        ListIterator<WordsEntity> lit = words.listIterator();
        while (lit.hasNext()){
            WordsEntity item = lit.next();
            System.out.println(item.getWord());
        }
    }

    public static void printLinesByNumber(List<TextFileEntity> file, int ...params){
        if (params == null) return;
        List<TextFileEntity> result = new ArrayList<>();

        for (int i: params) {
            if (i > 0 && i <= file.size())
                result.add(new TextFileEntity(file.get(i - 1).getPos(), file.get(i - 1).getLine()));
        }

        Collections.sort(result);
        pirntForward(result);
    }
}
