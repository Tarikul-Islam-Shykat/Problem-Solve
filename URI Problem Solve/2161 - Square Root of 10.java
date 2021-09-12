import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        
        double num =0;
        for(int i=0; i<N; i++)
        {
            num=num+6.0;
            num=(1.0/num);
        
        }
        num=num+3.0;
        
        System.out.printf("%.10f\n",num);
        
     
    }
    
}
