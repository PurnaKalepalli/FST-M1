package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.print("Enter the integers (Enter non-integer value to terminate the input from user) : ");
        while(scan.hasNextInt()) {
            arrayList.add(scan.nextInt());
        }
        Integer num[] = arrayList.toArray(new Integer[0]);

        Random indexVal = new Random();
        int index = indexVal.nextInt(num.length);
        System.out.println("Index value generated : " + index);
        System.out.println("Value in array at generated index: " + num[index]);

        scan.close();
    }
}