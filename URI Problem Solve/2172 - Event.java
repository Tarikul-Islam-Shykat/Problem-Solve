import java.util.Scanner;
public class Main{
	
    public static void main(String[] args)  {
        
    	   Scanner sc = new Scanner(System.in);
           
           int X,M;
           
           
           while(( X = sc.nextInt())!=0 && ( M = sc.nextInt())!=0){
               
               if(X==0 && M==0)
               {
               break;
               }
           
               else
               {
                   System.out.println(M*X);
               }
           }
                  
           
    }
	
}
