import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class data_structures {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number_of_opeation = sc.nextInt();
        Stack<Integer> bank = new Stack<>();

        while (number_of_opeation>0){
            int query = sc.nextInt();

            if(query == 1){
                int input_ = sc.nextInt();
                bank.add(input_);
            }
            else if (query == 2 ){
                bank.pop();
            }
            else if(query == 3)
            {
                int max = 0;
                for(int i = 0 ;  i< bank.size(); i++){
                    if(bank.get(i)> max){
                        max = bank.get(i);
                    }
                }
                System.out.println(max);
            }

            number_of_opeation--;
        }

    }
}

