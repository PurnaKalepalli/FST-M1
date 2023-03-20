package Activities;

import java.util.Arrays;

public class Activity4 {
    public static void ascendingOrder(int Array[]){
        int temp;
        for(int i=0;i<Array.length-1;i++){


            for(int j=1;j<Array.length-i;j++){
                if(Array[j-1]> Array[j]){
                    temp=Array[j-1];
                    Array[j-1] = Array[j];
                    Array[j]=temp;


                }
            }

        }

    }
    public static void main(String [] args){
    int[] Array = {10,8,7,11,1,22,15,12,30,25} ;
    System.out.println("Initial Array is: "+Arrays.toString(Array));
    ascendingOrder(Array);
    System.out.println("Final Sorted Array is: "+Arrays.toString(Array) );

    }
}
