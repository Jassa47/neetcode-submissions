class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val window = HashSet<Char>()
        var l =0
        var res =0
        var r =0

        for(c in s)
        {
            while(window.contains(c))
            {
                window.remove(s[l])
                l++
            }
            window.add(c)
           
            if(r-l+1>res)
            {
                res = r-l+1
            }
            r++
        }
        return res
        
        
    }
}
