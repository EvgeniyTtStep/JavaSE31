package org.itstep.lesson5;

import java.util.Scanner;

public class Hw2 {

    //2)	Напишіть програму, яка перевірятиме,
    // чи є введене число з клавіатури,
    // паліндромом (яке можна однаково прочитати в обох напрямках).
    // Наприклад, 123454321 або 221122 — паліндром. Програма має вивести YES,
    // якщо число є паліндромом, і NO якщо число не паліндром.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int palindrom = sc.nextInt();
        System.out.println(palindrom); // 1 2332 1


        // variant 1

        String palStr = String.valueOf(palindrom);
          //  012345
          // "123321"

        boolean b = false;

        for (int i = 0 , j = palStr.length()-1; i < j; i++, j--){
            if(palStr.charAt(i) == palStr.charAt(j)){
                b = true;
            }else {
                b = false;
                break;
            }
        }


        if(b == true){
            System.out.println("palindrom");
        }else {
            System.out.println("Not palindrom");
        }



        //variant 2
        //
//        int count = 0;
//        while((palindrom/=10) != 0){
//            System.out.println(palindrom);
//            count++;
//        }
//        System.out.println("count = " + (count+1));
    }
}
