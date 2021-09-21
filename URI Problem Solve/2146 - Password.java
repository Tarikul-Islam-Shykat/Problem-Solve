import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
      
        int N;
       while((N= sc.nextInt())<=9999)
       {
           
           if(N==9999)
           {
               System.out.println(9999-1);
           break;
           }
           
           System.out.println(N-1);
       
       }
     
    }
}
