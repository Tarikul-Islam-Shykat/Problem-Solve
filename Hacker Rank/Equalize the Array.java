import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class learning {

    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max_count = 0;
        List<Integer> list=new ArrayList<Integer>();


        for(int i = 0; i< arr.length; i++){
            int sum = 0;
            if(list.contains(arr[i])){
                //System.out.println("exist");
            }
            else
            {
                list.add(arr[i]);
                //System.out.println("Nope");
                for(int j = 0; j< arr.length; j++){
                    if(arr[i] == arr[j]){
                        sum = sum + 1;
                    }
            }
                //System.out.println(sum);
                if(sum>max_count){
                    max_count = sum;
                }
            }



        }

        System.out.println(arr.length-max_count);



    }
}
