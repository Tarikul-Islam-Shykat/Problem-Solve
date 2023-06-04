import java.util.HashMap;
import java.util.Map;

public class hacker_rank_2 {
    public   static  void main(String[] args){

        String s = "III";
        System.out.println(romanToInt(s));

    }

    public static  int romanToInt(String roman){
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int total_sum = 0;

        int i = 0;
        while (i<roman.length())
        {

            i++;
        }

            if (numbersMap.get(roman.charAt(i)) > numbersMap.get(roman.charAt(i+1))){
                int val = numbersMap.get(roman.charAt(i));
                total_sum = total_sum + val;
            }
            else if (numbersMap.get(roman.charAt(i)) < numbersMap.get(roman.charAt(i+1))){
                int val = numbersMap.get(roman.charAt(i));
                total_sum = total_sum + val;
            }
            else
            {
                int val = numbersMap.get(roman.charAt(i));
                total_sum = total_sum + val;
            }




           /* try{
                if(numbersMap.get(roman.charAt(i)) <  numbersMap.get(roman.charAt(i +1)))
                {
                    int val = (numbersMap.get(roman.charAt(i +1)) - numbersMap.get(roman.charAt(i)));
                    total_sum = total_sum + val;
                }
                else
                {
                    int val = numbersMap.get(roman.charAt(i));
                    total_sum = total_sum + val;
                }
            }
            catch (Exception e){

            }*/

            /*int j = i +1;
            System.out.println(j);
            System.out.println(roman.length());

            if(j<roman.length()) {
                if(numbersMap.get(roman.charAt(i)) <  numbersMap.get(roman.charAt(j)))
                {
                    int val = (numbersMap.get(roman.charAt(j)) - numbersMap.get(roman.charAt(i)));
                    total_sum = total_sum + val;
                    System.out.println("C VAL  - "+ val);
                    i = i +1;
                }
                else
                {
                    int val = numbersMap.get(roman.charAt(i));
                    total_sum = total_sum + val;
                    System.out.println("N VAL - "+ val);

                }

            }*/



        return total_sum;

    }
}
