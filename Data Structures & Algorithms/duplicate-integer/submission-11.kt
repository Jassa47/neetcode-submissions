class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        nums.sort()
        var bool = false
        for(i in 1 until nums.size)
        {
            if(nums[i] == nums[i-1])
            {
                bool = true;
            }
        }
        return bool

    }
}
