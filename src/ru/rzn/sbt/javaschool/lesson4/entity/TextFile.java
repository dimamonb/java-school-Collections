package ru.rzn.sbt.javaschool.lesson4.entity;

public class TextFile implements Comparable{
    private int pos;
    private String line;

    public TextFile(int pos, String line){
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
        TextFile txt = (TextFile) o;

        return this.getPos() - txt.getPos();
    }
}
