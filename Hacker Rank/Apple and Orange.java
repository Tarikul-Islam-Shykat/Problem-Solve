import java.util.*;
public class practice1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //System.out.print("Starting of sames house : ");
       int s = sc.nextInt();
      // System.out.print("Ending of sames house : ");
       int t = sc.nextInt();
      // System.out.print("Location of apple tree: ");
       int a = sc.nextInt();
      // System.out.print("Location of Orange : ");
       int b = sc.nextInt();

       int m = sc.nextInt();
       int n = sc.nextInt();

       int applesOnHouse = 0;
       for (int i = 0; i < m; i++) {
           int applePosition = a + sc.nextInt();
           if (applePosition >= s && applePosition <= t) {
               applesOnHouse++;
           }
       }
       System.out.println(applesOnHouse);

       int orangesOnHouse = 0;
       for (int i = 0; i < n; i++) {
           int orangePosition = b + sc.nextInt();
           if (orangePosition >= s && orangePosition <= t) {
               orangesOnHouse++;
           }
       }
       System.out.println(orangesOnHouse);
    } 
}
