import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i<test; i++ ){

            try {
                long val = sc.nextLong();
                System.out.println(val+" can be fitted in:");

                if(val>= Byte.MIN_VALUE && val<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(val>= Short.MIN_VALUE && val<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(val>= Integer.MIN_VALUE && val<= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(val>= Long.MIN_VALUE && val<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch (Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }

    }
}
