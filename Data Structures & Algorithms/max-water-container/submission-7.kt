class Solution {
    fun maxArea(heights: IntArray): Int {
        var a= 0
        var b= heights.size-1
        var length = heights.size - 1
        var max=0

        while ( a<b)
        {
            if(heights[a]<=heights[b])
            {
                var area = heights[a]*length
                if(max < area)
                {
                    max=area

                }
                a++
                length--
                continue
            }
            if(heights[a]>heights[b])
            {
                var area = heights[b]*length
                if(max < area)
                {
                    max=area
                }
                b--
                length--
                continue
            }
            
        }
        return max;

    }
}
