import java.util.Scanner;

public class hacker_rank_2 {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];

        for(var input = 0; input<arr.length ; input++){
            arr[input] = sc.nextInt();
        }

        for(var i = 1; i<arr.length; i++){
            var current = arr[i];
            var prev_index = i -1 ;

            while(prev_index>=0  && arr[prev_index]>current){

                arr[prev_index+1] = arr[prev_index];
                prev_index--;
                for(var k = 0; k<arr.length ; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }

            arr[prev_index+1] = current;
        }

        for(var k = 0; k<arr.length ; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
