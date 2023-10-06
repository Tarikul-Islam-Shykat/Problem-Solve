public static void isSubsequence(String s, String t) {
        if(s.length() == 0 ){
            System.out.println("true");
        }

        int left_pointer = 0;
        int right_pointer = t.length()-1;

        int count =  0;

        int left_pointer_2 = 0;
        int right_pointer_2 = s.length()-1;

        while(left_pointer < right_pointer){

            if(t.charAt(left_pointer) == s.charAt(left_pointer_2)){
                System.out.println("in");
                count++;
                left_pointer_2++;
            }

            if (t.charAt(right_pointer) == s.charAt(right_pointer_2)) {
                System.out.println("in");
                right_pointer_2--;
                count++;
            }

            if(left_pointer_2>right_pointer_2){
                break;
            }

            left_pointer++;
            right_pointer--;

            if(left_pointer == right_pointer){
                if(t.charAt(left_pointer) == s.charAt(left_pointer_2)  || t.charAt(right_pointer) == s.charAt(right_pointer_2))
                    count++;
                break;
            }
        }

        if(count == s.length()){
            System.out.println("found");
        }
        else {
            System.out.println("not");
        }
    }
