/*
 * author @[ Shashank Mondrati]
    version @ [9/17 2020]
    Description : Lab -01
 */
package helloworld;

import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, World.  ");
        System.out.println("Hello World");
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to ITSC 1213");
        }
        int[] numbers = {1, 4, 5, 6, 7,11, 45, 67, 99};
        System.out.println(" Sum of all numbers is :" +sumForLoop(numbers));
        System.out.println(" Maximum number in the array is:  " +findMax(numbers));

        //String a = " This is Miguel O'Hara from 2099";
        //String b = " This is Miguel h'Hara from 2099";
        
        String a = "test";
        String b = "testda";

        System.out.println(stringsEqual(a, b));

    }

    public static int sumForLoop(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

    public static int findMax(int[] numbers) {

        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length - 1];

    }

    public static boolean stringsEqual(String a, String b) {
        for (int i =0; i<a.length();i++){    
            for(int j =0; j<b.length();j++){
                boolean matched = false;
                //System.out.println("a "+a.charAt(i) + ", b"+b.charAt(j));
                if(a.charAt(i) == b.charAt(j)){
                    matched = true;
                    return true;
                } 
                if(!matched){
                    matched = false;
                    return false;
                }
            }
        
        }
        return true;
    }

}
