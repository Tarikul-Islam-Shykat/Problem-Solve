
class Solution {
    fun maxProfit(prices: IntArray): Int {
    var buy = prices[0]
    var max_profit = 0
    for (i in 1..prices.size-1)
    {
        var next_day_price  = prices[i]

        if(next_day_price < buy)
            buy = next_day_price

        else if (next_day_price > buy)
            max_profit = Math.max(next_day_price - buy, max_profit)
    }
    return max_profit
    }
}

Runtime
537 ms
Beats
78.96%
