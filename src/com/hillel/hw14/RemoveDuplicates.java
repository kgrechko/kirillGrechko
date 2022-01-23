package com.hillel.hw14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> FirstCollection = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i<100; i++)
        {
            FirstCollection.add(random.nextInt(20));
        }

        System.out.println("\nFirst Collection:");
        System.out.println(FirstCollection);

        HashSet <Integer> SecondCollection = new HashSet<>(FirstCollection);

        System.out.println("\nSecond Collection without duplicates:");
        System.out.println(SecondCollection);

        int diff = FirstCollection.size() - SecondCollection.size();
        System.out.println("\n"+diff+" removed duplicates");
    }

}
