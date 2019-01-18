package ru.rzn.sbt.javaschool.lesson4;

import ru.rzn.sbt.javaschool.lesson4.dao.DataProcessing;
import ru.rzn.sbt.javaschool.lesson4.entity.TextFileEntity;
import ru.rzn.sbt.javaschool.lesson4.entity.WordsEntity;
import ru.rzn.sbt.javaschool.lesson4.util.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CountWords cw = new CountWords();
        
        List<TextFileEntity> tx = new ArrayList<>();
        DataProcessing.init(tx);

        List<WordsEntity> st;
        st = ToListOfWords1.toListOWords1(tx);


        System.out.println("----------------Оригинальный файл-----------------");
        PirntUtils.pirntForward(tx);
        System.out.println();


        System.out.println("---------------- Подсчет слов -------------------");
        cw.countWordsInFile(tx);
        System.out.println();

        System.out.println("---------------- Слова implement Comparable -------------------");
        Collections.sort(st);
        PirntUtils.pirntWords(st);
        System.out.println();

        System.out.println("---------------- Слова Comparator -------------------");
        Collections.shuffle(st);

        PirntUtils.pirntWords(CompareUsingComparator.comp(st));
        System.out.println();

        System.out.println("----------------Вывод файла в обратном порядке ListIterator -------------------");
        PirntUtils.pirntBackward(tx);

        System.out.println("---------------- Вывод определенных строк файла -------------------");
        PirntUtils.printLinesByNumber(tx,3,6,4,1,9);
    }
}
