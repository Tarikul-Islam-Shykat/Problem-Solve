import java.util.Scanner;
public class Main{
	
    public static void main(String[] args)  {
        
    	   Scanner sc = new Scanner(System.in);
           String s =sc.nextLine();
           String[] bits = s.split("");
           
           int count =0;
           
           for(String bit:bits)
           {
               if(bit.equals("1"))
               {
               count++;
               }
           }
           
           if(count%2==0)
           {
           System.out.println(s+0);
           }
           else
           {
           System.out.println(s+1);
           }
    }
	
}
