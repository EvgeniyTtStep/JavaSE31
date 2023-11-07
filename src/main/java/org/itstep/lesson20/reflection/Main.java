package org.itstep.lesson20.reflection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.*;
import java.util.List;

public class Main extends Object {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Animal animal = new Animal();
        System.out.println(animal);

//        Class<? extends Animal> aClass = animal.getClass();
//        Class<Animal> animalClass = Animal.class;
//        Class clazz = Class.forName("org.itstep.lesson20.reflection.Animal");

        Class<Animal> animalClass = Animal.class;
        Field[] fields = animalClass.getDeclaredFields();


        for (Field field : fields) {
            System.out.println("Type = " + field.getType());
            System.out.println("Name = " + field.getName());

            if (!field.getName().equals("name")) {
                field.setAccessible(true);
                field.setInt(animal, 50);
                System.out.println("new age = " + field.getInt(animal));
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


        Method[] methods = animalClass.getMethods();

        for (Method method : methods) {
            TypeVariable<Method>[] typeParameters = method.getTypeParameters();
            for (TypeVariable<Method> typeParameter : typeParameters) {
                System.out.println("typeParameter.getName() = " + typeParameter.getName());
                System.out.println("============");
            }
        }

    }
}
