package org.itstep.lesson26.practice.service;

import org.itstep.lesson26.practice.db.DefaultDictionary;
import org.itstep.lesson26.practice.model.Dictionary;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Metods {
    private DefaultDictionary defaultDictionary;
    private Dictionary dictionary;


    public Metods() {
        dictionary = new Dictionary();
        defaultDictionary = new DefaultDictionary();
      defaultDictionary.defaultVocabulary();
    }



    public void addWord(String word, String translation){
        Set<String> translateSet = new HashSet<>();
        if(!dictionary.getDictionary().containsKey(word)){
            translateSet.add(translation);
            dictionary.getDictionary().put(word, translateSet);
        }
        dictionary.getDictionary().get(word).add(translation);
    }


}
