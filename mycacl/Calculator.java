package com.masai.mycacl;
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        String ss;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many No to Add or multiply");//10
            int i = sc.nextInt();
            int input[] = new int[i];
            System.out.println("Enter " + i + " No to Add");// 3 4 7 6 4
            Scanner scLine = new Scanner(System.in);
            String j = scLine.nextLine();
            String[] in = j.split(" ");
            for (int k = 0; k < i; k++) {
                input[k] = Integer.parseInt(in[k]);
            }

            System.out.println("Enter 1 for add");
            System.out.println("Enter 2 for multiply");
            Scanner scInput=new Scanner(System.in);
            int number=scInput.nextInt();
            switch (number) {
                case 1:
                    // program to add number in array

                    int sum = 0;
                    for (int numberToAdd : input) {
                        sum = sum + numberToAdd;
                    }

                    System.out.println("Your sum is " + sum);
                    break;
                case 2:
                    int multipication = 1;
                    for (int numberToMultiply : input) {
                        multipication = multipication * numberToMultiply;
                    }

                    System.out.println("Your multipication is " + multipication);
                    break;
                default:
                    System.out.println("print default");

            }


            System.out.println("do you want to add more number,press Y for yess and press N for no");
            Scanner scOptions = new Scanner(System.in);
            ss=scOptions.nextLine();
        }while(ss.equals("y")||ss.equals("Y"));
        System.out.println("Thanks For Using My Software");
    }

}
