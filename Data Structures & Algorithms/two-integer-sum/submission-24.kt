class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for((i,n) in nums.withIndex())
        {
            map[n] = i
        }
        for((i,n) in nums.withIndex())
        {
            var diff = target- n
            
            if(map.containsKey(diff) && map[diff] != i)
            {
                return intArrayOf(i,map[diff]!!)
            }
        }
        return intArrayOf()


        

    }
}
