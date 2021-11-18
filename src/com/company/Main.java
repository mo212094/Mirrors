package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();
        ArrayList<Integer> reversedNumbers = new ArrayList<>();

        userNumbers = getNumbers();
        reversedNumbers = reverseArray(userNumbers);

        System.out.println(userNumbers);

        boolean mirror = isMirrored(userNumbers);
        System.out.println(mirror);

    }

    //
    public static ArrayList<Integer> getNumbers(){
        ArrayList<Integer> userNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                System.out.println( "Type done if finished");
                String userInput = input.next();

                if (userInput.equals("done")){
                    break;
                }
                userNumbers.add(Integer.parseInt(userInput));
            }catch(Exception e){
                System.out.println();
            }
        }
        return userNumbers;
    }
    //
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> userArray){
        ArrayList<Integer> reversedArray = new ArrayList<>();
        for(int i = userArray.size()-1; i >= 0; i--){
            reversedArray.add(userArray.get(i));
        }
        return reversedArray;
    }
    //
    public static boolean isMirrored(ArrayList<Integer> userArray){
        int size = userArray.size();
        Collections.sort(userArray);


        return false;
    }

}
