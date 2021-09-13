import java.util.Scanner;
public class Practice3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        
        int count =0;
        
        for (int i = 0; i < 10000; i++) {
            
            x1=x1+v1; // added in every turn 
            x2=x2+v2;
            
            if(x1==x2) // if it match in any point it means its true
            {
                System.out.println("YES");
                count++;
                
            }
        }
        if(count==0)
        {
            System.out.println("NO");
        }
              
    }
    
}
