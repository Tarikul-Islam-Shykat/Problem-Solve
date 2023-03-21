import java.util.Scanner;
public class math {
    public static  void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int test_case = sc.nextInt();

        for (int i = 0 ; i< test_case; i++){
            int n = sc.nextInt();
            if(isFibonacci(n) == true)
                System.out.println("IsFibo");
            else
                System.out.println("IsNotFibo");
        }

    }

    static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);}

    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
}
