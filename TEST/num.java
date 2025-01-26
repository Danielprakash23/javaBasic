package TEST;
import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner maths = new Scanner(System.in);

        int a = maths.nextInt();
        int b= maths.nextInt();
        int c = maths.nextInt();

        int d = (a*b*c);
        int e =(a+b+c);

        System.out.println(d/e);

    }
}
