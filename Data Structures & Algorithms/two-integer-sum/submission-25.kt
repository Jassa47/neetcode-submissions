class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()

        for((i,n) in nums.withIndex())
        {
            var diff = target- n
            if(map.containsKey(diff))
            {
                return intArrayOf(map[diff]!!, i)
            }
            map[n] = i
        }
        return intArrayOf()


        

    }
}
