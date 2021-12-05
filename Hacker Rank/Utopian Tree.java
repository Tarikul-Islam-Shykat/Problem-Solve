import java.util.Scanner;

public class algo1 {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[60];
        for(int i = 0; i< arr.length; i++)
        {
            if(i ==0 )
            {
                arr[i] = 1;
            }
            else if(i%2 != 0)
            {
                int num = arr[i-1];
                int result = num *2;
                arr[i] = result;
            }
            else if(i%2 == 0)
            {
                int num = arr[i-1];
                int result = num + 1;
                arr[i] = result;
            }
        }

        int counter = sc.nextInt();

        while (counter != 0)
        {
            int n = sc.nextInt();
            System.out.println(arr[n]);
            counter--;
        }
    }
}
