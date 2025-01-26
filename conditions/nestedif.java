package conditions;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        
        // if it is KFC is true then enter &if enter eat chicken &eat chicken drink coke

        Scanner input = new Scanner(System.in);

        System.out.println("is this KFC true or false:");
        boolean KFC = input.nextBoolean();


        System.out.print("here the decision is ");

        if( KFC == true){
            System.out.println("enter into KFC");


            System.out.println("is this chicken is true");
             boolean chicken = input.nextBoolean();



            if (chicken ==true){
                System.out.println("Eat chicken");


                 System.out.println("is this coke is true ");
                 boolean coke = input.nextBoolean();

                 

                if (coke ==true){
                    System.out.println("drink coke");
                }
            }
        }
        else {
            System.out.println("not going anywhere.");
        }
        

    }
    
    
}
