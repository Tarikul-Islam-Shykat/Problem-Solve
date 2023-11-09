class Solution {
    public String gcdOfStrings(String str1, String str2) {
           var result = "";
        var k = "";
        var arr = str2.toCharArray();

        for (int i =0; i<arr.length; i++){
            k = k + arr[i];
            if(str1.replaceAll(k,"").isEmpty() && str2.replaceAll(k,"").isEmpty()){
                result  = k ;
            }

        }
        return result; 
    }
}
