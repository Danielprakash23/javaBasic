package conditions;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("win or loss:");
        String RCB = input.nextLine();

        if(RCB.equals("win")){
            System.out.println("Ee sala cup namadhey");
        }
        else{
            System.out.println("cup ila");
        }
    }
    
}
