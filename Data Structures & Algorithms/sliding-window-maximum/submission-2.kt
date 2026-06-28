class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        var sizeNums = nums.size
        var final = IntArray(sizeNums-k+1)
        for(i in final.indices )
        {
            var max = nums[i]
            for (j in i until i + k) 
            {     
                max = maxOf(max, nums[j])
            }
            final[i]=max;
        }
        return final;

    }
}
