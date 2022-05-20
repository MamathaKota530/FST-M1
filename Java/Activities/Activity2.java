package activities;

public class Activity2 {
    public static void main(String args[]){
        int[] numbers ={10, 77, 10, 54, -11, 10};
        int sum = 0;
        for(int num : numbers){
            if(num == 10){
                sum += num;
            }
        }
        if(sum == 30){
            System.out.println("sum of all the 10's in the array is exactly 30.");
        }
    }
}
