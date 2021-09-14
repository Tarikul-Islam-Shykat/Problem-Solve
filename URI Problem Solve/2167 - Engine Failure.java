import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int [] arr = new int[N];
                
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
        arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < N-1; i++) {
    		if (arr[i] > arr[i+1]) {
    			count = i+2;
    			break;
    		}
    	}
        
        System.out.println(count);
      
        
     
    }
}
