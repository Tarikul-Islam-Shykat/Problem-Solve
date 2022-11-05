import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String dateString = String.format("%d-%d-%d",year, month, day);
        try {
            Date date = new  SimpleDateFormat("yyyy-M-d").parse(dateString);
            String dayofWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
            System.out.println(dayofWeek.toUpperCase());
        } catch (ParseException e) {
            System.out.println("Error occured");
        }


    }
}
