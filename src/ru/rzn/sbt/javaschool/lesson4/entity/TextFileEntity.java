package ru.rzn.sbt.javaschool.lesson4.entity;

public class TextFileEntity implements Comparable {
    private int pos;
    private String line;

    public TextFileEntity(int pos, String line){
        this.pos = pos;
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public int getPos() {
        return pos;
    }


    @Override
    public int compareTo(Object o) {
        TextFileEntity t = (TextFileEntity) o;
        return  this.getPos() - t.getPos();
    }
}
