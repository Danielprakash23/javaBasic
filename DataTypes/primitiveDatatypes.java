package DataTypes;
public class primitiveDatatypes {
    public static void main(String[] args) {
         //byte ( -128  to 127)
        byte a = -128;
        byte a1 = 127;
        double b  = Math.pow (-2, 7);
        byte c = (byte)b;
        
        //short {(-2**15 to 2**15 -1)}
        short d = -32768;
        short e = 32767;

        //int(-2**31 to 2**31-1)
        int f = -2147483648;
        int g = 2147483647; 

        //long (-2**63 to 2**63 - 1)
        long h1 = -1234567890;
        long i2 = 1234567890;


        //float  6 to 7 decimals  and ends with f 
        float j = 5.33f;

        //Double upto 15 decimal
        Double k = 15.111111111111115555;

        //char  eg 'a' or '1' seq of char is String
        String L = "Hello";
        System.out.println(L.charAt(0));

        //boolean only 2 input true or false
        int m = 1;
        int n = 2 ;

        boolean o =  m > n;

        System.out.println(o);





        System.out.println();
    }
}
