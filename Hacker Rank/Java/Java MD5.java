import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hacker_rank_1 { // Tag Content Extractor
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest= md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashText = no.toString(16);
            while (hashText.length()<32){
                hashText = "0"+ hashText;
            }
            System.out.println(hashText);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
