class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
        {
            return false
        }

        val freq = HashMap<Char,Int>()

        for(c in s)
        {
            freq[c]= freq.getOrDefault(c,0)+1
        }
        for(c in t)
        {
            freq[c]= freq.getOrDefault(c,0)-1
        }

        return freq.values.all { it== 0}


    }
}
