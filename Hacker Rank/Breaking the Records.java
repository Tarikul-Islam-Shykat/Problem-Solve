import java.util.*;

public class hackerRank4{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int [] arr = new int[n];

    for(int i = 0; i<arr.length; i++ )
    {
        arr[i] = scanner.nextInt();
    }

    int loss = 0;
    int win = 0;

    int first_result = arr[0];
    int second_result = first_result;

    for(int i = 0; i< arr.length; i++)
    {
        if (arr[i] > first_result) {
            first_result = arr[i];
            win++;
        }

        else if (arr[i] < second_result) {
            second_result = arr[i];
            loss++;
        }
    }

    System.out.println(win+" "+loss);
    }
}
