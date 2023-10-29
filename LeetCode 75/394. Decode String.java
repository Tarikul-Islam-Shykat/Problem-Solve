class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<Integer>();
        Stack<String> results = new Stack<String>();
        String res = "";
        int index = 0;
        
        while (index < s.length()) {
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while (Character.isDigit(s.charAt(index))){
                    count = count * 10 + (s.charAt(index)-'0');
                    index ++;
                }
                counts.push(count);
                
            }
            else  if (s.charAt(index) == '['){
                results.push(res);
                res = "";
                index ++;
            }

            else  if (s.charAt(index) == ']'){
                StringBuilder temp  = new StringBuilder(results.pop());
                int length = counts.pop();
                for (int i = 0; i< length ; i ++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            }
            else {
                res = res + s.charAt(index);
                index ++ ;
            }
        }
        return res;
    }
}
