class Solution {
    fun maxArea(heights: IntArray): Int {
        var max = 0
        var l = 0
        var r = heights.size -1
        var small =0

        while(l<r)
        {
            var length = r-l
            if(heights[l]<heights[r])
            {
                small=heights[l]
                var area = small*length
                if(area > max)
                {
                    max= area
                }
                l++
                continue
            }
            else
            {
                small=heights[r]
                var area = small*length
                if(area > max)
                {
                    max= area
                }
                r--
                continue
            }
        }
        return max
    

    }
}
