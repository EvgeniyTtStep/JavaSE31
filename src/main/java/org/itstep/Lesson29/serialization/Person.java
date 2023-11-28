package org.itstep.Lesson29.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person implements Serializable {

    enum Gender{
        MALE, FEMALE
    }

    private String name;
    private Gender gender;

    private transient String email;  //transient - забороняє цьому полю записуватись у файл

    public Person(String name, Gender gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static  List<Person> cretePerson(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bob", Gender.MALE, "bob@email"));
        personList.add(new Person("Max", Gender.MALE, "max@email"));
        personList.add(new Person("Ann", Gender.FEMALE, "ann@email"));

        return personList;
    }

    public static void objectOut(){

       try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.bin"))) {
           out.writeLong(Person.cretePerson().size());
           for (Person person : Person.cretePerson()) {
               out.writeObject(person);
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

    public static void objectIn(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.bin"))) {
            long length = in.readLong();
            Person[] persons = new Person[(int) length];

            for (int i = 0; i < persons.length ; i++) {
                persons[i] = (Person) in.readObject();
                System.out.println("persons = " + persons[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        //Person.objectOut();
        Person.objectIn();

    }
}
