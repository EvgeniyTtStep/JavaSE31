package org.itstep.Lesson18;

public class Test {
    //super. та super()
    //які методи не можна переориділяти?
    //об'єкт яких класів не можна створити?
    //що таке інтерфейс
    //що таке абстрактний клас
    //яке слово для реалізаціі інтерфейсу - implements
    //ассоціфція та композиція
    {
        ITest test = new ITest() { //анонимній класс
            @Override
            public void test() {
                System.out.println("test");
            }
        };
    }
}
