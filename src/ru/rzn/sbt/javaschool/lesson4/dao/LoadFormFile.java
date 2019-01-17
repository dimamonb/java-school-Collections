package ru.rzn.sbt.javaschool.lesson4.dao;


import ru.rzn.sbt.javaschool.lesson4.entity.FileDataCollection;
import ru.rzn.sbt.javaschool.lesson4.entity.TextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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

}
