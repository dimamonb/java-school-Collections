package ru.rzn.sbt.javaschool.lesson4;

import ru.rzn.sbt.javaschool.lesson4.dao.LoadFormFile;
import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;
import ru.rzn.sbt.javaschool.lesson4.util.CountWords;
import ru.rzn.sbt.javaschool.lesson4.util.TextPrint;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CountWords cw = new CountWords();
        List<TextFile> tx = new ArrayList<>();

        LoadFormFile.init(tx);
        System.out.println("---------------- Подсчет слов -------------------");
        cw.countWordsInFile(tx);
        System.out.println();

        System.out.println("----------------Оригинальный файл-----------------");
        TextPrint.pirntForward(tx);
        System.out.println();

        System.out.println("----------------Вывод файла в обратном порядке ListIterator -------------------");
        TextPrint.pirntBackward(tx);

    }
}
