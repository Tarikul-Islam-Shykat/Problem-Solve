import java.util.Scanner;
public class Practice1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // you can use int  i used long for no reason actually
       int size = sc.nextInt();

        long [] array= new long[size];

        for(int i=0; i<size; i++)
        {
            array[i]= sc.nextLong();
        }

        long max =0;
        
        for(int i=0;i<size;i++)
        {
            if(array[i]>max)
            {
            max =array[i]; // finding the max value or the talles one
            }
        }
        
        int counter =0;
        for(int i=0;i<size;i++)
        {
            if(array[i]==max)
            {
            counter++; // how many tallest are there
            }
        }
        
        
               
        System.out.println(counter); //print
    }
}

// link : https://www.hackerrank.com/challenges/birthday-cake-candles/problem
