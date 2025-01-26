package conditions;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //check whether number 1 and number 2 is equal or not


        System.out.print("Enter the number1:");
        int a = input.nextInt();

        System.out.print("Enter the number2:");
        int b = input.nextInt();


        System.out.print("The Answer is :");
        if (a == b){
            System.out.println("Equal");
        }
        else{
            System.out.println("NotEqual");
        }
        

       
    }
    
}
