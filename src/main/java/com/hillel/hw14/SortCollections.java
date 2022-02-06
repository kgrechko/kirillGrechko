package main.java.com.hillel.hw14;

import java.util.ArrayList;
import java.util.Random;

public class SortCollections {
    public static void main(String[] args) {
        ArrayList<Integer> MainCollection = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i<100; i++)
        {
            MainCollection.add(random.nextInt(500));
        }

        System.out.println("\nFirst Collection:");
        System.out.println(MainCollection);

        ArrayList<Integer> DivisibleBy2 = new ArrayList<Integer>();
        ArrayList<Integer> DivisibleBy3 = new ArrayList<Integer>();
        ArrayList<Integer> NotDivisible = new ArrayList<Integer>();

        for (int i = 0; i< MainCollection.size(); i++)
        {
            if (MainCollection.get(i) % 2 == 0)
            {
                DivisibleBy2.add(MainCollection.get(i));
            }
            if (MainCollection.get(i) % 3 == 0)
            {
                DivisibleBy3.add(MainCollection.get(i));
            }
            if (MainCollection.get(i) % 2 != 0 && MainCollection.get(i) % 3 != 0 )
            {
                NotDivisible.add(MainCollection.get(i));
            }

        }
            System.out.println("\nCollection with numbers divisible by 2:");
            System.out.println(DivisibleBy2);

            System.out.println("\nCollection with numbers divisible by 3:");
            System.out.println(DivisibleBy3);

            System.out.println("\nCollection with numbers not divisible by 2 or 3:");
            System.out.println(NotDivisible);

    }
}
