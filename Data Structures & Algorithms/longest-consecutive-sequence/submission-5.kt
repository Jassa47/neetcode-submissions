class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       val numSet = nums.toSet()

       var max = 0

       for( num in nums)
       {
          var prev = num-1
          var next = num+1
         if( prev !in numSet)
         {
            var h=1
            while(next in numSet)
            {
                h++
                next++
            }
            if(h>max)
            {max=h}
            
         }
       }
       return max
    }
}
