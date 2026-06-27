class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        nums.sort()
        var bool = false
        for(i in 0 until nums.size-1)
        {
            if(nums[i] == nums[i+1])
            {
                bool = true;
            }
        }
        return bool

    }
}
