import java.util.Scanner;

public class Pracrtice2
{
    public static void main(String[] args)
    {
 
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();
        
        int hour = Integer.parseInt(time.substring(0,2));
        
       int minute = Integer.parseInt(time.substring(3,5));
       
        int second = Integer.parseInt(time.substring(6,8));
        
        String dayNight = time.substring(8,10);
        
        if(dayNight.equals("PM") && hour<12)
        {  
            hour=hour+12;
        }
        
        else if(dayNight.equals("AM") && hour==12)
        {
           hour=0;
        }
        
         else if(dayNight.equals("AM") && hour<12)
        {
           hour=hour;
        }
        
         else if(dayNight.equals("PM") && hour==12)
        {  
            hour=hour;
        }
        
      System.out.println(String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second));
    }
    
        
}

// Link : https://www.hackerrank.com/challenges/time-conversion/problem
