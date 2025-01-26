package TEST;
import java.lang.foreign.AddressLayout;
import java.util.Scanner;


public class b{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine( );
        int Age =  input.nextInt( );
        double marks =input.nextDouble();
        
        input.nextLine();
        String Address = input.nextLine();

        System.out.println("Name:"+ name);
        System.out.println("Age:"+Age);

        System.out.println(marks/10 +"/10");
        System.out.println("Address:"+ Address);



    }
}