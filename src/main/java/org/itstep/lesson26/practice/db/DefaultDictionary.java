package org.itstep.lesson26.practice.db;

import org.itstep.lesson26.practice.model.Word;

import java.util.*;

public class DefaultDictionary {


    Map<String, Set<String>> dictionary = new HashMap<>();

    public Map<String, Set<String>> defaultVocabulary() {
        dictionary.put("January", new HashSet<>());
        dictionary.put("February", new HashSet<>(List.of("лютий")));
        dictionary.put("March", new HashSet<>(List.of("березень")));
        dictionary.put("April", new HashSet<>(List.of("квітень")));
        dictionary.put("May", new HashSet<>(List.of("травень")));
        dictionary.put("June", new HashSet<>(List.of("червень")));
        dictionary.put("July", new HashSet<>(List.of("липень")));
        dictionary.put("August", new HashSet<>(List.of("серпень")));
        dictionary.put("September", new HashSet<>(List.of("вересень")));
        dictionary.put("October", new HashSet<>(List.of("жовтень")));
        dictionary.put("November", new HashSet<>(List.of("листопад")));
        dictionary.put("December", new HashSet<>(List.of("грудень")));

        return dictionary;
    }
}
