class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();
        for (int i = 0; i<numRows; i++){
            List<Integer> subList = new ArrayList<>();
            if(i == 0){
                subList.add(1);
            }
            else if(i == 1){
                subList.add(1);
                subList.add(1);
            } else {
             //   System.out.println("Previos list  "+mainList.get(i-1));
                List<Integer> prevList = (mainList.get(i-1));
                subList.add(1);
                for (int j = 0; j < prevList.size(); j++) {
                    if(j != prevList.size()-1){
                        subList.add(prevList.get(j) + prevList.get(j+1));
                    }
                    else {
                        subList.add(1);
                    }
                }
            }
            mainList.add(subList);
        }
      //  System.out.println(mainList);

        return  mainList;
    }
}
