package conditions.Test1;

import java.util.Scanner;

public class test2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  a Score:");
        int score =input.nextInt();

        if(score < 50){
            System.out.println("you need to improve.");
            
        }
        else if (score>=50 && score<=70){
            System.out.println("Goodjob.");
        }
        else if(score > 70){
            System.out.println("Excellent performance");
        }

    }
    
}
