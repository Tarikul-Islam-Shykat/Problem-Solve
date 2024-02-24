

int reverse(int x) {
  String number = x.toString();
  String revers_num = "";

    for(int i = number.length-1; i >= 0; i--){
      var result = int.tryParse(number[i]);
      if(result!=null){
        revers_num = revers_num+number[i];
      }
      else{
        revers_num = number[i] + revers_num;
      }
  }

    x = int.parse(revers_num);
  if(x >= 2147483648  || x <= -2147483648){
    return 0;
  }
  else{
    return x;
  }


}
