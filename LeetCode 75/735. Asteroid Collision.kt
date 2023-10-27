class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack_  = Stack<Int>()
    for( i in 0..asteroids.lastIndex){
        while (stack_.isNotEmpty() && asteroids[i] <0  && stack_.peek() > 0){
            val diff = asteroids[i] + stack_.peek()
            when{
                diff < 0 -> stack_.pop()
                diff > 0 -> asteroids[i] = 0
                else -> {
                    asteroids[i] = 0
                    stack_.pop()
                }
            }
        }
        
        if(asteroids[i] !=0 ){
            stack_.push(asteroids[i])
        }
    }
    return  stack_.toIntArray()
    }
}
