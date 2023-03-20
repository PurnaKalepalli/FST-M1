package Activities;
import java.util.ArrayList;
public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("JAVA");
        myList.add("Python");
        myList.add("SQL");
        myList.add("C");
        myList.add("RDBMS");

        System.out.println("Print all the names");
        for(String nm : myList) {
            System.out.println(nm);
        }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is C# is in list: " + myList.contains("C#"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("SQL");
        System.out.println("New Size of ArrayList: " + myList.size());
    }



}
