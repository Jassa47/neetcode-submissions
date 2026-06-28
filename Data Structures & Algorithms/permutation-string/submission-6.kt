class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length)
        {
            return false
        }

        var window = s1.length
        var f1 = IntArray(26)
        var f2 = IntArray(26)

        for( c in s1)
        {
            f1[c - 'a']++
        }


        for( r in s2.indices)
        {
            f2[s2[r]-'a']++

            if(r>=window)
            {
                f2[s2[r-window]-'a']--
            }
            if(f1.contentEquals(f2))
            {
                return true;
            }
           
        }
        return false
    }
}
