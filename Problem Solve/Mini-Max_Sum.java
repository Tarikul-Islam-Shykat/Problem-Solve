import java.util.Scanner;
public class Practice1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

       int size =5;

        long [] array= new long[size];

        for(int i=0; i<size; i++)
        {
            array[i]= sc.nextLong();
        }
        
        // initialized the max and min
        long max =0;
        long min =0;

        long sum=0;
        for(int i=0;i<size;i++)
        {
            for(int j=0; j<size;j++ )
            {
                if(j==i)
                {
                
                }
                else
                {
                sum+=array[j]; 
                }
            }
            
            if(i==0)// we will get the sum of the 1st element. So we stored in max and min so that we can check with our future result
            {
                max =sum;
                min =sum;
            }

            if(sum>max)
            {
                max=sum;
            }
            
            if(sum<min)
            {
                min=sum;
            }
            sum=0;
        }
        System.out.println(min+" "+max); //print
    }
}

//link : https://www.hackerrank.com/challenges/mini-max-sum/problem
