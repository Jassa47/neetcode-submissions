class Solution {
    fun minWindow(s: String, t: String): String {
        if (t.isEmpty()) return ""

        val countT = HashMap<Char, Int>()
        for (c in t) {
            countT[c] = countT.getOrDefault(c, 0) + 1
        }

        var res = 0;
        var l =0
        val window = HashMap<Char, Int>()
        var sizet=countT.size;
        var minSize= Int.MAX_VALUE
        var resArr = IntArray(2){-1}

        for(r in s.indices)
        {
            val c = s[r]
            window[c] = window.getOrDefault(c,0) + 1
            if (countT.containsKey(c) && window[c] == countT[c]) 
            {
                res++
            }
            while(res == sizet)
            {
                if ((r - l + 1) < minSize) {
                    resArr[0] = l
                    resArr[1] = r
                    minSize = r-l+1
                }

                window[s[l]] = window.getOrDefault(s[l], 0) - 1

                if (countT.containsKey(s[l]) && (window[s[l]] ?: 0) < countT[s[l]]!!) 
                {
                    res--
                }
                l++
            }
        }
        return if (resArr[0] == -1) "" else s.substring(resArr[0], resArr[1] + 1)
    }
}
