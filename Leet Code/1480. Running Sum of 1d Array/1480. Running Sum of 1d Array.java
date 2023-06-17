    static int[] runningSum(int[] nums) {

        int count = 0;
        int sum = 0;
        for(int i = 0 ; i <nums.length; i ++){
            sum = sum + nums[i];
            nums[count] = sum;
            count++;
        }

        return  nums;
    }
}


Runtime
0 ms
  
Beats
100%
  
Memory
41.7 MB
  
Beats
97.1%
