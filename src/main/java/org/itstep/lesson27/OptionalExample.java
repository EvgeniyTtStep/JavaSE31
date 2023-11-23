package org.itstep.lesson27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        //System.out.println(list.stream().max(Comparator.naturalOrder()).orElse("empty collection"));


        Optional<String> optional = list.stream().max(Comparator.naturalOrder());


        if(optional.isPresent()) {
            System.out.println(optional.get());
        }else {
            System.out.println("NullException");
        }

        if (optional.isEmpty()){
            System.out.println("Collection is empty");
        }

        System.out.println(optional.orElse("Hello"));

        System.out.println(optional.orElseGet(() -> "get supplier"));


    }
}
