class Solution {
    public int maxArea(int[] height) {
        int starting_pointer = 0;
        int endining_pointer = height.length-1;

        int max_height = 0;

        while (starting_pointer <= endining_pointer){

            int pointer = 0;
            int min = Math.min(height[starting_pointer], height[endining_pointer]);
            int area = min * (endining_pointer - starting_pointer);
            max_height = Math.max(max_height, area);

            if( height[starting_pointer]  < height[endining_pointer]){
                starting_pointer ++;
            }
            else {
                endining_pointer--;
            }
        }

        return max_height;
    }
}
