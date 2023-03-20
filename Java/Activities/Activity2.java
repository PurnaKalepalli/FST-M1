package Activities;



public class Activity2 {

    public static void main(String [] args){
        int[] Array = {10, 77, 10, 54, -11, 10};
        int total = 0;


        for(int i=0;i<Array.length;i++){
            if(Array[i] == 10){
                total = total+Array[i];
            }

        }
        if(total == 30){
            System.out.println("Sum of total 10's is 30");
        }
        else{
            System.out.println("Sum of toltal 10's is not equal to 30");
        }
    }
}
