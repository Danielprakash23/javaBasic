package conditions.Excercise;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ex3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // get a input it is div bt both 3 and 5  or not
        //if yes print "the number is divisible by 3 and 5" or not 
        System.out.print("Enter a nuber:");
        int num = input.nextInt();

        System.out.print("The given number is ");

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by 3 and 5.");

        }
        else{
            System.out.println("Not Divisible by 3 and 5 ");
        }
         
    }

    
}
