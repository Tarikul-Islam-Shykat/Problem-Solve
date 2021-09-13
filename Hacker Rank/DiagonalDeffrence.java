import java.util.Scanner;
public class Practice3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) { 
                arr[i][j]=sc.nextInt();
            }
        }
        
        int sum=0;
        for (int i = 0; i < size; i++) { 
          int val= arr[i][i];
          sum=sum+val;
        }
        
        
        int col=1;
        int sum1=0;
        for (int i = 0; i < size; i++) {
           int val = arr[i][size-col];
           col++;
           sum1= sum1+val;
        }
        
        System.out.println(Math.abs(sum1-sum));
        
    }
}


// https://www.hackerrank.com/challenges/diagonal-difference/problem
