import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double M = sc.nextDouble();
        double P = sc.nextDouble();
        double d =M/P;
        
        System.out.printf("%.2f\n",d);
       
    }
    
}
