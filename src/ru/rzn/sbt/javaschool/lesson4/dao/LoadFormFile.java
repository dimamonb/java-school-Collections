package ru.rzn.sbt.javaschool.lesson4.dao;


import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;
import ru.rzn.sbt.javaschool.lesson4.entity.WordsProcessing;
import ru.rzn.sbt.javaschool.lesson4.util.ToListOfWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoadFormFile {

    public static final String fileName = "src/test.txt";

    public static void init(Collection<TextFile> list) {

        List<String> l = null;
        try (Stream<String> lines = Files.lines(Paths.get(fileName))){
            l = lines.collect(Collectors.toList());
        } catch (IOException e) {

        }
        for (int i = 0; i < l.size(); i++) {
            list.add(new TextFile(i+1, l.get(i)));
        }
    }

    public static void init(List<TextFile> lines,  List<WordsProcessing> words){
        List<String> l;
        l =ToListOfWords.toListOWords(lines);
        for (String w: l){
            words.add(new WordsProcessing(w));
        }
    }

}
