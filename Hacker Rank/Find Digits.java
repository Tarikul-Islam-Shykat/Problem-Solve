import java.util.*;
public class hackerRank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); 
          int [] arr = new int [n];
          
          for(int i=0; i<arr.length; i++)
          {
              arr[i]=sc.nextInt();
          }
          int count =0;
          for(int i = 0; i < arr.length; i++)
          {
            int num = arr[i]; // for testing in while loop
            int num2 =arr[i];
            while (num > 0) {

                long remainder = num % 10;
                
                try {
                    if (num2 % remainder == 0) {
                        count++;
                    }
                } catch (Exception e) {
                    // nothing to do here
                }

                num = num / 10;
            }
            System.out.println(count);
            count =0;

          }
    }
}
