package ru.rzn.sbt.javaschool.lesson4.util;

import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;

import java.util.*;

public class TextPrint {

    public static void pirntForward(List<TextFile> file){
        ListIterator<TextFile> lit = file.listIterator();
        while (lit.hasNext()){
            TextFile item = lit.next();
            System.out.println(item.getPos() + " " + item.getLine());
        }
    }

    public static void pirntBackward(List<TextFile> file){
        ListIterator<TextFile> lit = file.listIterator(file.size());

        while (lit.hasPrevious()){
            TextFile item = lit.previous();
            System.out.println(item.getPos() + " " + item.getLine());
        }
    }
}
