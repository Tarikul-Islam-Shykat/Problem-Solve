public class Geeks{
    
    public static void main(String[] args){
        
        // Primitive array
        int[] arr = {2,7,9,3,1};
        int n = arr.length;


        int [] d = new int[arr.length];

        if(arr.length == 1){
            System.out.println(arr[1]);
            // return arr[i];
        }

        else  if(arr.length == 2){
            int max = Math.max(arr[0], arr [1]);
            System.out.println(max);
            // return arr[i];
        } else {

             for(int i = 0 ; i < arr.length; i ++ ){
                if(i == 0 ){
                    d[i] = arr[i];
                } 

                else if(i == 1){
                    d[i] = arr[i];
                } 
                else {
                          System.out.println("First = " + (arr[i] + arr[i-2]));
                         System.out.println("Second = " + arr[i-1]);
                         
                         System.out.println();

d[i] = Math.max((arr[i] + d[i-2]), d[i-1]);
                }

                

        }
        }

                for(int i = 0 ; i < arr.length; i ++ ){
                    System.out.println(d[i]);

                

        }


                return d[arr.length-1]



       

}

}


class Solution {
    public int rob(int[] arr) {
        int[] d = new int[arr.length];
        if (arr.length == 1) {
            return arr[0];
        } else if (arr.length == 2) {
            int max = Math.max(arr[0], arr [1]);
            return max;
        }

        else {

            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    d[i] = arr[i];
                }

                else if (i == 1) {
                    d[i] = arr[i];
                } else {
                   
                    d[i] = Math.max((arr[i] + d[i - 2]), d[i - 1]);
                }

            }
        }

        return d[arr.length-1];
    }

}



