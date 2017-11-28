package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


        System.out.println("Array of strings");
        String[] strings = {"red", "green", "blue"};
        Arrays.sort(strings);
        for (String color : strings){
            System.out.println(color);
        }


        System.out.println("Setting an initial size");


        System.out.println("Copying an array");

    }

}
