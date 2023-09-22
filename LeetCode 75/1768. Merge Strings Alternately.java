class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        String output = "";



        for (int i = 0; i <length1; i++){
            output  += word1.charAt(i);
            if(i < length2){
                output  += word2.charAt(i);
            }
        }

        if(length2 > length1){
            output  += word2.substring(length1, length2);
        }

        return output;
    }
}
