package org.itstep.lesson26.practice.model;

import org.itstep.lesson26.practice.db.DefaultDictionary;
import org.itstep.lesson26.practice.model.Word;

import java.util.*;

public class Dictionary {

    private Map<String, Set<String>> dictionary = new DefaultDictionary().defaultVocabulary();

    public Dictionary() {
    }

    public Dictionary(Map<String, Set<String>> dictionary) {
        this.dictionary = dictionary;
    }

    public Map<String, Set<String>> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, Set<String>> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "dictionary=" + dictionary + '}';
    }

}
