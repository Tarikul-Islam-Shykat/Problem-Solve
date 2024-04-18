class Solution {
  List<int> twoSum(List<int> numbers, int target) {
    var list  = <int>[];
  var left_pointer = 0;
  var right_pointer = numbers.length-1;
  while(left_pointer < right_pointer){
    var result_sum = numbers[left_pointer] + numbers[right_pointer];
    if (result_sum == target){
      list.add(left_pointer + 1);
      list.add(right_pointer + 1);
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
  }

  return list;
  }
}
