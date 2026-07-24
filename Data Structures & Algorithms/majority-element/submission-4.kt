class Solution {
    fun majorityElement(nums: IntArray): Int {
        var map = HashMap<Int,Int>()
        var max = 0
        var res = 0
        for( num in nums)
        {
            map[num]= map.getOrDefault(num,0)+1
            if(map[num]!! >max)
            {
                max = map[num]!!
                res= num
            }
        }
        return res
    }
}
