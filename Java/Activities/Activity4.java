package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String args[]){
        int[] numbers = {30,10,70,20,60};
        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                int tmp = 0;
                if (numbers[i] > numbers[j])
                {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            //System.out.println(numbers[i]);
        }
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
    }
}
