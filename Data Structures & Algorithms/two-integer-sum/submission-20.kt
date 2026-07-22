class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for ((i, n) in nums.withIndex()) {
            map[n] = i
        }
        for ((i, n) in nums.withIndex()) {
            val temp = target - n
            if (map.containsKey(temp) && map[temp] != i) {   // exclude matching itself
                return intArrayOf(i, map[temp]!!)
            }
        }
    return intArrayOf()

    }
}
