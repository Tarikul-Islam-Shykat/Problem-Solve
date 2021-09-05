import java.util.Scanner;
public class Practice3{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            
                arr[i]=sc.nextInt();
        }
        
        int [] multiple = {5,10,15,20,25,30,35,40,45,50,
        55,60,65,70,75,80,85,90,95,100};
        
        for (int i = 0; i < size; i++) {
            
            if(arr[i]<38)
            {
            arr[i]=arr[i];
            }
            
            else  if(arr[i]==100)
            {
            arr[i]=arr[i];
            }
            
            
            else
            {
                int num = result(arr[i],multiple); // this method wil find the nearest highest number 
             
                // then here we check if can round it up or not according to the condition
                if(num-arr[i]>=3)
                    
                {
                 arr[i]=arr[i];
                }
                
                else if(num-arr[i]<3)
                {
                arr[i]=num;
                }
                             
            }
            
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
     
    }
    
    public static int result(int i, int[] multiple)
    {
        int num=0;
        
        for (int j = 0; j <multiple.length; j++) {
            
            if(multiple[j]>i)
            {
             num = multiple[j];
             break;
            }
            
        }
        return num;
    
    }
    
}
