package conditions.Excercise;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        //check odd or even
        System.out.print("Enter a number:");
        int a = input.nextInt();

        System.out.print("the given number is ");
        if(a % 2==0 ){

            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
        

        
    
    }
    
}
