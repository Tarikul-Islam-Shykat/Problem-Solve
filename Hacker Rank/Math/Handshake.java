import java.util.Scanner;
public class math {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();

        for(int i = 0; i<test_case; i++){
            int total_handshakes = 0;
            int number_of_handshakes = sc.nextInt();

            if(number_of_handshakes == 1)
            {
                total_handshakes = 0;
            }
            else
            {
                for (int j = number_of_handshakes-1; j>0; j--){

                    total_handshakes = j +total_handshakes;
                }
            }
            System.out.println(total_handshakes);
        }
    }
}
