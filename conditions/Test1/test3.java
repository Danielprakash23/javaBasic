package conditions.Test1;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a mark1:");
        int sub1 = input.nextInt();

        System.out.print("Enter a mark2:");
        int sub2 = input.nextInt();

        System.out.print("Enter a mark3:");
        int sub3 = input.nextInt();

        System.out.print("Enter a mark4:");
        int sub4 = input.nextInt();

        System.out.print("Enter a mark5:");
        int sub5 = input.nextInt();

        int a = sub1+sub2+sub3+sub4+sub5;

        int avg = a/2;

        if(avg <35){
            System.out.println("Additional class is requried");
        }
        else{
            System.out.println("your good to go");
        }
        
    }
}