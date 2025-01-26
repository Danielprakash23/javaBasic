package conditions.Test1;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your salary:");
        int salary  = input.nextInt();

        System.out.print("enter your");
        int age = input.nextInt();

        if(salary>=20000 || age <= 25){

            System.out.println("you are eligible for loan");

            System.out.print("enter loan amount:");
            int loan = input.nextInt();

            if(loan <50000){
                System.out.println("your are eligible for loan");
            }
            else if ( loan >= 50000){
                System.out.println("maximum amount of loan is 500000");
            }

        }
        

    //     else if (salary <= 50000){
    //         System.out.println("you are eligible for loan");

    //     }
    //     else if (salary > 50000){
    //         System.out.println(" maximum amount of loan is 50000");
    //     }
     }
    
}
