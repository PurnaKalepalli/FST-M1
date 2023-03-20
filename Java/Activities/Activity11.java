package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> Colours = new HashMap<Integer, String>();
        Colours.put(1,"Blue");
        Colours.put(2,"Orange");
        Colours.put(3,"White");
        Colours.put(4,"Red");
        Colours.put(5,"Green");
        System.out.println("The Original map is : "+ Colours);
        Colours.remove(3);
        System.out.println("After removing White : " + Colours);

        if(Colours.containsValue("Orange")) {
            System.out.println("Orange exists in the Map");
        } else {
            System.out.println("Orange does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + Colours.size());
    }
}