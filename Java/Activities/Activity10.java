package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String args[]){
        HashSet hs = new HashSet();
        hs.add("King");
        hs.add("John");
        hs.add("Hover");
        hs.add(10);
        hs.add(90.9);
        hs.add(8);

        System.out.println("Size of the Hashset is " + hs.size());
        System.out.println(hs.remove(10));
        System.out.println(hs.remove("queen"));
        System.out.println(hs.contains("King"));
        System.out.println(hs);
    }
}
