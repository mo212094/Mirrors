package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static int mirrors() {

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> userNumbers = new ArrayList<String>();
        while(true){
            System.out.println( "Type done if finished");
            String userInput = input.next();
            if (userInput.equals("done")){
                break;
            }
            userNumbers.add(userInput);
        }
        System.out.println(userNumbers);
    }
}
