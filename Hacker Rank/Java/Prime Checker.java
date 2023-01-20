import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hacker_rank_1 { // Tag Content Extractor
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
        for(int i = 0; i<5 ; i++){
            int a = sc.nextInt();

            arrayList.add(a);

            for (Integer number: arrayList){
                boolean result = checkPrime(number);
                if(!result){
                    continue;
                }
                else
                {
                    System.out.print(number+" ");
                }
            }
            System.out.println();

        }
    }

    public static boolean checkPrime(int val){
        if(val<=1){
            return false;
        }
        for (int i = 2; i< val; i++){
            if(val%i == 0){
                return false;
            }
        }
        return  true;
    }
}

// not working 

