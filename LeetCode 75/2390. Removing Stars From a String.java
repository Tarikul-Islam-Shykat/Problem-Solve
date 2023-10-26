class Solution {
    public String removeStars(String s) {
        Stack<String> stack = new Stack<String>();

        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == '*'){
                stack.pop();
            }
            else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop()+result;
            //System.out.println(stack.pop());
        }
        return result;
    }
}
