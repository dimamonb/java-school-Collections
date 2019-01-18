package ru.rzn.sbt.javaschool.lesson4.entity;

public class WordsProcessing implements Comparable<WordsProcessing> {
    private String word;

    public WordsProcessing(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }


    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(WordsProcessing w) {
        if (word.length() != w.word.length())
            return (word.length() - w.word.length());
        return word.compareTo(w.word);
    }



}
