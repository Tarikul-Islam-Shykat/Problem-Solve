class Solution {
    public boolean isValid(String s) {
int value = s.length();
        if(value == 1){ // if only one bracket
            return  false;
        }
        if(value > 1){ // if more than one bracket
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i<value ; i++){
                // checking opening bracket
                char character = s.charAt(i);
                if(character == '(' || character == '{' || character == '[' ){
                    stack.push(character);
                }
                else { // checking closing bracket
                    if (stack.isEmpty()){ // if stack already empty
                        return false;
                    }
                    else { // stack not empty
                        Character c = stack.peek();
                        if(character == ')' && c == '('){
                            stack.pop();
                        }else if(character == '}' && c == '{'){
                            stack.pop();
                        }
                        else if(character == ']' && c == '['){
                            stack.pop();
                        }
                        else {
                            return false;
                        }
                    }
                }

            }
            if(!stack.isEmpty()){
                return false;
            }
        }
        return true;
    }
}
