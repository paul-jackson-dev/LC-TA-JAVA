package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

//        Scanner input = new Scanner(System.in); // TODO: bonus
//        System.out.println("Enter a sentence.");
//        String string = input.nextLine();
//        string = string.replaceAll("[^a-z0-9]", "");

        char[] characters = string.toLowerCase().toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char letter : characters)
            if (!hashMap.containsKey(letter)){
                hashMap.put(letter, 1);
            }
            else {
                hashMap.put(letter, hashMap.get(letter) + 1 );
            }


        for(Map.Entry<Character, Integer> pair : hashMap.entrySet()){
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }
}