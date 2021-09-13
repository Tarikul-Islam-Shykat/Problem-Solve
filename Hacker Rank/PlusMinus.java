import java.util.Scanner;
public class Practice3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            
                arr[i]=sc.nextInt();
            
        }
        
        double pos=0;
        double neg =0;
        double zero =0;
       
        for (int i = 0; i < size; i++) {
            
            int val = arr[i];
            
            if(val>0) {   pos++; }
            
            else if(val<0) { neg++;}
            
            else if(val==0) { zero++; } 
        }
        
        System.out.println(pos/(double)size);
        System.out.println(neg/(double)size);
        System.out.println(zero/(double)size);
           
    }
}

// https://www.hackerrank.com/challenges/plus-minus/problem
