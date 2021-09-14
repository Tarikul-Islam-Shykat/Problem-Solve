import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      double root_5 = Math.sqrt(5);
        
     double part1 = (1+root_5)/2 ;
     double part2 = (1-root_5)/2 ;
     
     double pow1 = Math.pow(part1,n);
     double pow2 = Math.pow(part2,n);
     
     double result = (pow1 -pow2)/root_5;
     
     System.out.printf("%.1f\n",result);
    }
    
}
