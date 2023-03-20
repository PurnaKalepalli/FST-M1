package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("L");
        hs.add("A");
        hs.add("K");
        hs.add("I");
        hs.add("5");
        hs.add("9");

        System.out.println("Original Hash Set is : "+ hs);
        System.out.println("Hash set size is : " + hs.size());
        System.out.println("Removed 5 from Hash Set : "+ hs.remove("5") );
        if (hs.remove("B")) {
            System.out.println("B removed from the hash set");
        } else {
            System.out.println("B is present in the hash set");
        }
        System.out.println("Checking if A is present: " + hs.contains("A"));
        System.out.println("Updated HashSet: " + hs);
    }
}