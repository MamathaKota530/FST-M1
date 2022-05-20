package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String args[]){
        List<String> names = new ArrayList<String>();
        names.add("Sita");
        names.add("Ram");
        names.add("Geta");
        names.add("King");
        names.add("Queen");

        System.out.println("Printing All the names in the list:");
        for(String name:names){
            System.out.println(name);
        }

        System.out.println("3rd name in the list is " + names.get(2));
        if(names.contains("King")){
            System.out.println("Expected value is present in the list");
        }else{
            System.out.println("Expected value is not present in the list");
        }
        System.out.println("Size of the list : " + names.size());
        names.remove("Queen");
        System.out.println("Size of the list : " + names.size());
    }


}
