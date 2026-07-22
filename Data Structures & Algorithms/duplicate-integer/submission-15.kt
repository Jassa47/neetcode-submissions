class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        nums.sort()
        val size = nums.size
        for( i in 1 until size)
        {
            if(nums[i-1] == nums[i])
            {
                return true
            }
        }
        return false

    }
}
