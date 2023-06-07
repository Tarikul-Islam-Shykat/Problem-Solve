class Solution {
    public int romanToInt(String s) {
         Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int total_sum = 0;

        for (int i = 0; i<s.length(); i++){
            if(i+1 == s.length()){
                int val = numbersMap.get(s.charAt(i));
                total_sum = total_sum + val;
                continue;
            }
            else {
                System.out.println(s.charAt(i));
                if (numbersMap.get(s.charAt(i)) < numbersMap.get(s.charAt(i+1))){
                    int val = numbersMap.get(s.charAt(i+1)) - numbersMap.get(s.charAt(i));
                    total_sum = total_sum + val;
                    i = i+1;
                }
                else if (numbersMap.get(s.charAt(i)) >= numbersMap.get(s.charAt(i+1))){
                    int val = numbersMap.get(s.charAt(i));
                    total_sum = total_sum + val;
                }
            }

        }

        return total_sum;
    }
}
