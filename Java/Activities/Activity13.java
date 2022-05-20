package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void  main(String args[]) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        Integer nums[] = list.toArray(new Integer[0]);

        int randomValue = indexGen.nextInt(nums.length);
        System.out.println("Random Value " + randomValue);
        System.out.println("Value in array " + nums[randomValue]);
        sc.close();
    }
}

