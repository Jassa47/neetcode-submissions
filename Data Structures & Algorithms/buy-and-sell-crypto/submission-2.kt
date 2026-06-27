class Solution {
    fun maxProfit(prices: IntArray): Int {
        var l = 0
        var r = 1
        var max = 0

        while(r < prices.size)
        {
            if(prices[l]>prices[r])
            {
                l++
            }
            else
            {
                var diff = prices[r] - prices[l]
                if(diff>max)
                {
                    max=diff
                    
                }
                r++
            }
            
        }
        return max
    }
}
