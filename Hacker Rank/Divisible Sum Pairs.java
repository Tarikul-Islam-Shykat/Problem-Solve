import java.util.*;

public class hackerRank4{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int k = scanner.nextInt();

    int [] arr = new int[n];

    for(int i = 0; i<arr.length; i++ )
    {
        arr[i] = scanner.nextInt();
    }

    int counter = 0;
    int result = 0;
    for(int i = 0; i< arr.length; i++)
    {

        int num = arr[i];

        for(int j = counter; j<arr.length; j++)
        {
            if(i<j)
            {
                int sum =arr[i]+ arr[j];
                if(sum == k)
                {
                    //System.out.println("(" + i+","+j+")");
                   // System.out.println("Sum : "+sum);
                    result++;
                }

                else if(sum % k == 0)
                {
                    //System.out.println("(" + i + "," + j + ")");
                    result++;
                }
            }
        }

        counter ++;

    }
    //System.out.println("Result : "+result);
    System.out.println( result);
    }
}
