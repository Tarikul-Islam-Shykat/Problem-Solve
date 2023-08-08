import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leet_code_1 {
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char[] charArray = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(charArray, 50));

    }

    public static int leastInterval(char[] tasks, int n) {

        if(n == 0)  { return tasks.length; }
        else
        {
            int [] charMap = new int[26];
            for (char c : tasks){
                charMap[c-'A']++;
            }

            Arrays.sort(charMap);
            int max_val = charMap[25];
            int idle_slot = (max_val-1) * n;
            int individual_idle_slot = idle_slot/2;
            int rest_idle_slot = idle_slot-individual_idle_slot;





            for(int i = 24; i>=0; i--){
                if(individual_idle_slot > 0){
                    individual_idle_slot = individual_idle_slot - Math.min(charMap[i], max_val);
                }
                else {
                    rest_idle_slot = rest_idle_slot -  Math.min(charMap[i], max_val);
                }
            }

            System.out.println(individual_idle_slot);
            System.out.println(rest_idle_slot);

            int total_unit_of_time  = 0 ;

            if(individual_idle_slot>0){
                total_unit_of_time = total_unit_of_time + individual_idle_slot;
            }

            if(rest_idle_slot>0){
                total_unit_of_time = total_unit_of_time + rest_idle_slot;
            }


            return  total_unit_of_time + tasks.length;

        }



    }

}


///https://leetcode.com/problems/task-scheduler/
