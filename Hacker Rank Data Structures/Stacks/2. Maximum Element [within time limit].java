import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class data_structures {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number_of_opeation = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> max_val = new Stack<>();
        
        for (int i = 0 ; i<number_of_opeation; i++){
            int input = sc.nextInt();
            switch (input){
                case 1:
                    int x = sc.nextInt();
                    stack.push(x);
                    if (max_val.isEmpty() || x>=max_val.peek()){
                        max_val.push(x);
                    }
                    break;
                case 2:
                    int popV1 = stack.pop();
                    if (popV1 == max_val.peek()){
                        max_val.pop();
                    }
                    break;
                case 3:
                    System.out.println(max_val.peek());
                    break;
                default:break;

            }
        }

        sc.close();
    }
}

