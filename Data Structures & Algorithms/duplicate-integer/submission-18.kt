class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val size = nums.size
        
        val set = HashSet<Int>()

        for(num in nums)
        {
            set.add(num)
        }

        if(set.size != size)
        {
            return true
        }
        return false
    }
}
