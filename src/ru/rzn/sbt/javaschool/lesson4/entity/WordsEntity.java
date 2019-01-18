package ru.rzn.sbt.javaschool.lesson4.entity;

public class WordsEntity implements Comparable<WordsEntity> {
    private String word;

    public WordsEntity(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }


    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(WordsEntity w) {
        if (word.length() != w.word.length())
            return (word.length() - w.word.length());
        return word.compareTo(w.word);
    }



}
