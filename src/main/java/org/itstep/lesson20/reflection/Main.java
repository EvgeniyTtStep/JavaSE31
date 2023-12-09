package org.itstep.lesson20.reflection;



import java.lang.reflect.*;
import java.util.List;

public class Main extends Object {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);

//      Class<? extends Animal> aClass = animal.getClass();
//        Class<Animal> animalClass = Animal.class;
        try {
            Class clazz = Class.forName("org.itstep.lesson20.reflection.Animal");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Class<Animal> animalClass = Animal.class;
        Field[] fields = animalClass.getDeclaredFields();


        for (Field field : fields) {
            System.out.println("Type = " + field.getType());
            System.out.println("Name = " + field.getName());

            if (!field.getName().equals("name")) {
                field.setAccessible(true);
                try {
                    field.setInt(animal, 50);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                try {
                    System.out.println("new age = " + field.getInt(animal));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("=============");
        }
        System.out.println("animal = " + animal.getAge());


        Constructor<?>[] constructors = animalClass.getDeclaredConstructors();
        System.out.println("----------------");
        for (Constructor<?> constructor : constructors) {
            System.out.println("const name = " + constructor.getName());
            System.out.println("----------------");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("parameter.getName() = " + parameter.getName());
                System.out.println("parameter.getType() = " + parameter.getType());
                System.out.println("==============");
            }
        }


        Method[] methods = animalClass.getDeclaredMethods();

        for (Method method : methods) {
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("method parameter.getName() = " + parameter);
                System.out.println("method parameter.getName() = " + parameter.getType());
                System.out.println("============");
            }
        }

    }
}
