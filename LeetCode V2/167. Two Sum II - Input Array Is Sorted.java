class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left_pointer = 0;
        int right_pointer = numbers.length-1;
        while (left_pointer < right_pointer){
            //System.out.println(numbers[left_pointer]);
            //System.out.println(numbers[right_pointer]);
            int result_sum = numbers[left_pointer] + numbers[right_pointer];
            //System.out.println("----"+result_sum);
            if (result_sum == target){
                result[0] = left_pointer + 1;
                result[1] = right_pointer + 1;
                break;
            }
            else if (result_sum > target){
                //System.out.println("result_sum > target");
                right_pointer--;
            }
            else if ((result_sum < target)){
                //System.out.println("result_sum < target");
                left_pointer++;
            }

            //System.out.println();
        }

        /*for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }*/
        return  result;
    }
}
