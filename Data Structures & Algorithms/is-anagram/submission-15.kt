class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
        {
            return false
        }

        val freqS = HashMap<Char,Int>()
        val freqT = HashMap<Char,Int>()

        for(i in s.indices)
        {
            freqS[s[i]]= freqS.getOrDefault(s[i],0)+1
            freqT[t[i]]= freqT.getOrDefault(t[i],0)+1
        }

        return freqS == freqT


    }
}
