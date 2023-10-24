package org.itstep.lesson14.developer;

public class DeveloperMain {
    public static void main(String[] args) {

        //Створення Екземпляру класу
        //Змінна з типом даних Developer
        //Створення об'єкту developer1
        Developer developer1 = new Developer();

       // developer1.name = "Jack";
        developer1.age = 87;
        developer1.experience = 100;
        developer1.technologies = "Java";

        System.out.println(developer1.name);
        System.out.println(developer1.age);
        System.out.println(developer1.experience);
        System.out.println(developer1.technologies);

        System.out.println(developer1.hashCode());

        Developer developer2 = new Developer();
       // developer2.name = "Bob";
        developer2.age = 15;
        developer2.technologies = "Python";
        developer2.experience = 1;


        developer1.writeCode();
        developer2.writeCode();


    }
}
