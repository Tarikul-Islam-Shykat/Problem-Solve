import java.util.Scanner;
import java.util.Stack;

public class math {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int test_case = sc.nextInt();

        Stack<String> games = new Stack<>();

        games.add("Call of duty");
        games.add("Guiter hero");
        games.add("Super Monkey Ball");

        System.out.println(games.pop()); // for getting the first element in the stack
        System.out.println(games.pop()); // for getting the first element in the stack
        System.out.println(games.pop()); // for getting the first element in the stack


        System.out.println(games.peek());// for getting the top element in the stack

        System.out.println(games.get(0));


    }
}
