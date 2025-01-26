package conditions.Excercise;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //if income > 7000 "scholarship is available or not Available"

        System.out.print("Enter your income :");
        int a = input.nextInt();

        System.out.print("Result:");
        if(a > 7000){
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Scholarship is not available:");
        }






    }
    
}

