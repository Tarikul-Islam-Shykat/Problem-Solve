class Solution {
  bool isValid(String s) {
      if(s.length == 1){
    return false;
  } else
    {
      List<String> stack = [];
      for(int i = 0; i<s.length; i++){
        var character = s[i];
        if(character == '(' || character == '{' || character == '[' ){
          stack.add(character);
        }else
        {
          if(stack.isEmpty){
            return false;
          }
          else
          {
            var c = stack.last;
            if(character == ')' && c == '('){
              stack.removeLast();
            }else if(character == '}' && c == '{'){
              stack.removeLast();
            }
            else if(character == ']' && c == '['){
              stack.removeLast();
            }
            else {
              return false;
            }
          }
        }
      }
      if(stack.isNotEmpty){
        return false;
      }
    }
  return true;
  }
}
