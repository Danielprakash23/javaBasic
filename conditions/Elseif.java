package conditions;

public class Elseif {
    public static void main(String[] args) {
        
        int a = 70;

        if (a >35 && a<60){
            System.out.println("video game");
        }
        else if(a>60 && a<90){
            System.out.println("Iphone");
        }
        else if(a>90){
            System.out.println("MacBook");
        }
    }
}
