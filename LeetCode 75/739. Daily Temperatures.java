class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Stack<Integer> stack = new Stack<>();
        int [] newTemp = new int[temperatures.length];

        for (int i =temperatures.length-1; i>=0; i--){

            if(stack.isEmpty()){
                stack.push(i);
                newTemp[i] = 0;
            }

            else{

                int top_item_index = stack.peek();
                int top_item = temperatures[top_item_index];

                if(temperatures[i] >= top_item){

                   while (temperatures[i] >= top_item){
                       stack.pop();
                       if(stack.isEmpty()){
                           stack.push(i);
                           newTemp[i] = 0;
                           break;
                       }
                       top_item =  temperatures[stack.peek()];
                   }

                   if(!stack.isEmpty()){
                       newTemp[i] = Math.abs(i - stack.peek());
                       stack.push(i);
                   }


                }
                else if (temperatures[i] < top_item) {

                    newTemp[i] =  top_item_index- i;
                    stack.push(i);
                }


            }

            /*for (int j =0; j< newTemp.length; j++){
                System.out.print(" "+ newTemp[j]);
            }
            System.out.println();*/
        }

        return newTemp;
    }
}
