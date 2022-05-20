package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String args[]){
        HashMap<Integer, String> colours = new HashMap();
        colours.put(1, "pink");
        colours.put(2, "blue");
        colours.put(3, "yellow");
        colours.put(4, "green");
        colours.put(5, "brown");

        System.out.println("Before removing " + colours);
        colours.remove(1);
        System.out.println("After removing " + colours);
        System.out.println(colours.containsValue("green"));
        System.out.println(colours.size());
    }
}
