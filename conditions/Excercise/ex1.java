package conditions.Excercise;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // if mark  > 35 print pass else fail

        System.err.print("enter  a mark:");
        int a = input.nextInt();


        System.out.print("Result is:");
        if(a >= 35){
            System.out.println("pass");

        }
        else{
            System.out.println("fail");
        }
    }
    
}
