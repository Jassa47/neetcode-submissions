class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for( i in nums.indices)
        {
            var temp = target - nums[i]
            if( temp in map ) 
            {
                return intArrayOf(map[temp]!!,i)
            }
            map[nums[i]]=i;
        }
        return intArrayOf()
    }
}
