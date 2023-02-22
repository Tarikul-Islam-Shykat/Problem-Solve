
import java.time.YearMonth;
import java.util.Scanner;
public class hacker_rank_1 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int limit = 256;

        if(val < 1919){
            int sum = 0;
            for(int i = 1; i <= 12; i++){
                sum = sum +  numberOfDaysInMonth(val, i);

                if(limit - sum < 30){
                    int date = limit-sum;
                    System.out.println(date+"."+String.format("%02d", i+1)+"."+val);
                    break;
                }

            }
        }
        else
        {
                int sum = 0;
                for(int i = 1; i <= 12; i++){
                    sum = sum +  numberOfDaysInMonth(val, i);

                    if(limit - sum < 30){
                        int date = limit-sum;
                        System.out.println(date+"."+String.format("%02d", i+1)+"."+val);
                        break;
                    }

                }
        }
    }
    public static int numberOfDaysInMonth(int year, int month){
        YearMonth yearMonth  =YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        return  daysInMonth;
    }
}




// https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=true

