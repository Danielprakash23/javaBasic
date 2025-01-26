import java. util.Scanner;
public class ternary2{
	public static void main(String[] args){	
	Scanner  input = new Scanner(System.in);
	
	System.out.println("enter a number:");
	int number1 = input.nextInt();
	
	System.out.println("enter a number:");
	int number2 = input.nextInt();
	
	String a = number1>number2? "number1 is greater":"number2 is greater";
	System.out.println(a);
	
}

}