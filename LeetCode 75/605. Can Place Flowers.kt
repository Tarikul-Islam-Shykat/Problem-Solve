class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
   var count = 0

    if (flowerbed.size == 1 && flowerbed[0]== 0){
        count = 1
    }

    else if (flowerbed.size == 1 && flowerbed[0]== 1){
        count = 0
    }

    else{
        for (i in 0 until flowerbed.size){
            var length = flowerbed.size

            if((i == 0)){
                if(flowerbed[i]== 0 && flowerbed[i+1]== 0){
                    count +=1
                    flowerbed[i]= 1
                }
            }

            else if (i == flowerbed.size-1){
                var index = flowerbed.size-1
                if(flowerbed[index]== 0 && flowerbed[index-1]== 0){
                    count +=1
                }
            }

            else{

                if(flowerbed[i]== 0){
                    if(flowerbed[i+1]== 0 && flowerbed[i-1] == 0){
                        count += 1
                        flowerbed[i] = 1
                    }
                }

            }

        }
    }

    if(count < n){
        return false
    }
    else
    {
        return true
    }

    }
}
