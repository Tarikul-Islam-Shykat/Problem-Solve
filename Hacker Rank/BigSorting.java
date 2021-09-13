  
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      BigInteger[] arr = new BigInteger[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextBigInteger();
        }
    
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }  
}
