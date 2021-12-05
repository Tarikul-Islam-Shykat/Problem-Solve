
import java.util.Scanner;

public class algo1 {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }


        for(int i = 0; i < number; i++){

            int j, first;
            first = arr[0];

            for(j = 0; j < arr.length-1; j++){

                arr[j] = arr[j+1];
            }

            arr[j] = first;
        }


        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
