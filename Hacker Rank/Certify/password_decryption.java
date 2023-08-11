package Demo;

import java.io.*;
import java.util.*;

class Result {


     static void decryptPassword(String s) {
         char[] myChar = s.toCharArray();
         String new_string = "";
         int number_count = 0;
         int zero_count = 0;
         for (int i = 0; i<myChar.length; i++){

             if(Character.isDigit(myChar[i])){
                 if(myChar[i] == '0'){
                 }
                 else {
                     number_count = number_count + 1;
                 }
             }

         }

         for (int i = 0; i<myChar.length; i++){
             int new_i = 0;
             if(myChar[i] == '*'){
                 continue;
             }
             else {
                 if(Character.isLowerCase(myChar[i])){
                     new_string = new_string + myChar[i];
                 }
                 if (Character.isUpperCase(myChar[i])) {
                      String s1 = String.valueOf(myChar[i]);
                     String s2 = String.valueOf(myChar[i+1]);
                     new_string = new_string + s2+s1;
                     i = i+1;
                 }
                 if(Character.isDigit(myChar[i])){
                     if(myChar[i] == '0'){
                         zero_count = zero_count + 1;
                         new_string = new_string + myChar[number_count - zero_count];
                     }
                 }

             }

             System.out.println("string : _"+new_string);
         }




         System.out.println(new_string);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       String s = "43Ah*ck0rr0nk";
      Result.decryptPassword(s);
    }
}
