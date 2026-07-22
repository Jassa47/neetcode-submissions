class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
    
        for ((i, n) in nums.withIndex()) {
            val temp = target - n
            if (map.containsKey(temp)) {   // exclude matching itself
                return intArrayOf(map[temp]!!,i)
            }
            map[n] = i
        }
    return intArrayOf()

    }
}
