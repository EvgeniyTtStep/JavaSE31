package org.itstep.lesson14;

import org.itstep.lesson14.developer.Developer;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Tom");
        developer.setAge(21);
        developer.setExperience(22);
        developer.setTechnologies("Java");


        System.out.println(developer.getName());
        System.out.println(developer.getAge());
        System.out.println(developer.getExperience());
        System.out.println(developer.getTechnologies());


        System.out.println(developer);


    }



}
