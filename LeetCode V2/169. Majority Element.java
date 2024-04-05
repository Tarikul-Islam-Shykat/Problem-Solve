static int majorityElement(int[] nums) {
        double limit = nums.length/2;
        int val = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }

            if(map.get(nums[i]) > limit){
                val = nums[i];
            }
        }
        return val;
    }
