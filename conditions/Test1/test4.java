package conditions.Test1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("red or yellow or green");
        String colour = input.nextLine();
        
        

        if(colour.equals("red")){
            System.out.println("stop");   
        }
        else if (colour.equals("yellow")){
            System.out.println("get ready");
        }
        else if (colour.equals("green")){
            System.out.println("go");
        }
    }
    
}
