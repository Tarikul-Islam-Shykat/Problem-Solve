import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int day=sc.nextInt(),month=sc.nextInt();

        int counter = 0;

        for(int i = 0; i<a.length; i++) {

            int sum = a[i]; 

            for (int j = 1; j<month; j++ ) {

                int check = i+ j;
                if(check == a.length)
                {
                    break;
                }
                else
                {
                    sum = sum + a[i+j]; // here i find the next month.length item //in the array
                   
                }
                check = 0;
            }
            if(sum == day)
            {
                counter++; 
            }
        }
        System.out.println(counter);

    }
}
