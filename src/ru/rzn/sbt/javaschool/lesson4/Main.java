package ru.rzn.sbt.javaschool.lesson4;

import ru.rzn.sbt.javaschool.lesson4.dao.LoadFormFile;
import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;
import ru.rzn.sbt.javaschool.lesson4.entity.WordsProcessing;
import ru.rzn.sbt.javaschool.lesson4.util.CompareUsingComparator;
import ru.rzn.sbt.javaschool.lesson4.util.CountWords;
import ru.rzn.sbt.javaschool.lesson4.util.TextPrint;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CountWords cw = new CountWords();
        List<TextFile> tx = new ArrayList<>();
        List<WordsProcessing> st = new ArrayList<>();

        LoadFormFile.init(tx);
        LoadFormFile.init(tx, st);

        System.out.println("----------------Оригинальный файл-----------------");
        TextPrint.pirntForward(tx);
        System.out.println();


        System.out.println("---------------- Подсчет слов -------------------");
        cw.countWordsInFile(tx);
        System.out.println();

        System.out.println("---------------- Слова implement Comparable -------------------");
        Collections.sort(st);
        TextPrint.pirntWords(st);
        System.out.println();

        System.out.println("---------------- Слова Comparator -------------------");
        Collections.shuffle(st);

        TextPrint.pirntWords(CompareUsingComparator.comp(st));
        System.out.println();

        System.out.println("----------------Вывод файла в обратном порядке ListIterator -------------------");
        TextPrint.pirntBackward(tx);

    }
}
