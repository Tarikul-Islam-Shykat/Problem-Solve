import java.util.Scanner;
public class hacker_rank_1 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean check_ = true;

        while(check_ == true) {

            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length()) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        s = s.substring(0, i) + s.substring(i + 2);
                    }
                }
            }
            check_ = check(s);
        }


        if(s.isEmpty()){    System.out.println("Empty String"); }
        else {   System.out.println(s);  }
    }
    public static boolean check(String s) {
        for (int i = 0; i<s.length(); i++){
            if(i+1<s.length()){
                if(s.charAt(i) == s.charAt(i+1)){
                    return  true;
                }
            }
        }
        return false;
    }

}
