class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int [] res = new int[n];

        int left = 1;

        for(int i = 0; i<n; i++){
            if(i > 0){
                left = left * arr[i-1];
            }
            res[i] = left;
        }

        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            if(i < n - 1){
                right = right * arr[i+1];
            }
            res[i] *= right;
        }

        return res;
    }
}
