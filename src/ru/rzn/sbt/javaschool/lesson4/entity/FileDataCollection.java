package ru.rzn.sbt.javaschool.lesson4.entity;

import java.util.ArrayList;
import java.util.Collection;

public class FileDataCollection {

    private Collection<String> collection;


    public FileDataCollection(Collection<String> collection){
        this.collection = collection;
    }


    public Collection<String> getCollection() {
        return collection;
    }
}
