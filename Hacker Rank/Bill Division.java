import java.util.*;
public class hackerRank1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
          int bill = sc.nextInt(); 
          int k = sc.nextInt(); 
          int [] arr = new int [bill];
          
          for(int i=0; i<arr.length; i++) { arr[i]=sc.nextInt(); }
          
          //System.out.print("anna : ");
           int anna = sc.nextInt();
          
          int sum = 0;
         
          for (int i = 0; i < arr.length; i++) { if(i==k) {
         
         } else{ sum=sum+arr[i]; } }
         
        int total =  sum/2;

        if( anna - total==0 )
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            System.out.println(anna - total);
        }

    }
    
}
