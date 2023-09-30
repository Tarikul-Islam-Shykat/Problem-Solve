class Solution {
    public int compress(char[] chars) {
        int compress = 0;
        boolean check = false;
        int count = 1;
        if (chars.length ==1){
            compress=1;
        }
        else{
            for (int i = 0 ; i <chars.length; i++) {
                if(chars[i] == chars[i+1] && i+ 1 < chars.length-1){
                    count += 1;
                }
                else{
                    //System.out.println(count);
                    if(i+ 1 == chars.length-1){
                        if(chars[i+1] == chars[i] ){
                            count +=1;
                        }
                        else{
                            count  = 1;
                        }
                        check = true;
                    }

                    if (count == 1){
                        compress +=1;
                        count = 1;
                        if (check){break;}
                    }
                    if(count > 1 & count<10){
                        compress += 2;
                        count = 1;
                        if (check){break;}
                    }
                    if (count>=10){
                        compress += 3;
                        count = 1;
                        if (check){break;}
                    }
                }
            }
        }

        return compress;
    }
}
