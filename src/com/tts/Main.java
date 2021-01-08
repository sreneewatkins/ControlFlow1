//F 1.8.21 Week 8 Day 5, Deck: Java Control Flow
//Working with Yusuf

package com.tts;
//import java.util.*;  will import all

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
/*
        //If-Else Statements
        int a = 5;
        if (a == 1) {
            System.out.println("A is 1");
        }else if (a == 2) {
            System.out.println("A is 2");
        }else if (a == 3) {
            System.out.println("A is 3");
        }else if (a == 4) {
            System.out.println("A is 4");
        }else {
            System.out.println("A is something else");
        }
*/
/*
        //Complex Conditional Stmt copied from slides - errors
        //must need to call the use of CheckId somewhere and pass values
        void CheckId( boolean validId, int age, boolean buyingAlc )
        // the CheckId is a method that needs to be defined outside of main
        //and referenced/called here.

        CheckId(true, 23, false);
 */
/*
        //Switch Cases
       // int a;
        for (int a = 0; a <= ; a++) {
            switch (a) {
                case 0:
                    System.out.println("a is" + a);
                    break;
                case 1:
                    int b = (a + 5);
                    System.out.println("a is" + a);
                    System.out.println("b is:" + b);
                    break;
                case 2:
                    int c = (a * 5);
                    System.out.println("a is" + a);
                    System.out.println("c is:" + c);
                    break;
                case 3:
                    int d = (a + 50);
                    System.out.println("a is" + a);
                    System.out.println("d is:" + d);
                    break;
                case 4:
                    System.out.println("a is" + a);
                    break;
                default:
                    System.out.println("a is" + a);
                    System.out.println("Nothing to see here.");
            }
        }//endfor
*/
/*
        //For Loop
        String[] names = new String[] {"Randy", "Aaliyah","Winter", "Joi","Ryan","Eric", "Renee"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("The current index is: " + i);
            System.out.println("The current name is: " + names[i]);
        }
*/
/*
        //Enhanced For Loop
        String[] names = new String[] {"Randy", "Aaliyah","Winter", "Joi","Ryan","Eric", "Renee"};
        for (String s : names) {
            System.out.println("Name is: " + s);
        //    System.out.println("Index is: " + i); wont's work
        }
        //Syntax of enhanced for loop
        for([data_type][variable] : [collection_name] ){
	        //code to execute on item
        }
        //Can be read as: For each ___ item in [collection_name] do:

        int[] simpleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // using the standard for loop and the length property of an array
        for (int i = 0; i < simpleArray.length; i++)
        {
            System.out.println("Normal for value: " + simpleArray[i]);
        }

        // using the enhanced for loop
        for (int item : simpleArray)
        {
            System.out.println("Enhanced for: " + item);
        }

        // both loops will print the their respective strings 1 - 10.
*/
/*
        //Nested For Loop
        String[] names = new String[] {"Randy", "Aaliyah","Winter", "Joi","Ryan","Eric", "Renee"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("The current index is: " + i);
            System.out.println("The current name is: " + names[i]);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
            for(int k = 0; k < 20; k++) {
                System.out.print("*");
                if (k == 19) {
                    System.out.println();
                }
            }
        }
*/
/*
        //While Loop
        boolean flag = true;
        int x = 0;

        while (flag) {
            x++;
            System.out.println("Hello" + x);
            if (x == 5555) {
                flag = false;
            }
        }
*/
/*
        //Do While Loop
        boolean flag = false;    //false flag will do loop once
        int x = 0;

        do {
            x++;
            System.out.println("Hello" + x);
            if (x == 55) {
                flag = false;
            }
        }
        while(flag); {
            System.out.println("Stop Here");
        }
*/
/*
        Scanner user = new Scanner(System.in);
        char character = 'c';

        do {
            System.out.println("Enter another char command or q to quit: ");

            character = user.next().charAt(0);
            System.out.println("character is " + character);
        } while(!(character == 'q' || character == 'Q'));
        System.out.println("Quit command entered!");
*/
/*
        //Ternary Operation
        boolean flag = true;   //change flage from true to false to test

        int z = (flag ? 3 : 5);
        System.out.println("z is: " + z);

        String m = (flag ? method1() : method2() );
        System.out.println("m is: " + m);
*/
/*
        //While Loop File reader slide 30, Deck Java Control Flow
        BufferedReader reader = new BufferedReader(new FileReader("src/myTextFile"));
        String line = reader.readLine();
        while (line != null)
        {
            System.out.println(line);
            line = reader.readLine();
        }
*/
    }//end main


    private static String method2() {
        return "twenty five";
    }

    private static String method1() {
        return "twenty three";
    }

    public static void CheckId( boolean validId, int age, boolean buyingAlc )
    {
        if (validId)
        {
            System.out.println("Valid ID presented");
            if((age>21) && (buyingAlc))
            {
                System.out.println("Customer legal to purchase alcohol");
            }
            else
            {
                System.out.println("No alcohol sales to this person");
            }
        }
        else
        {
            System.out.println("Error: Invalid License");
        }
    }


}//end Main
