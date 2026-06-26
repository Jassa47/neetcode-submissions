class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length)
        {
            return false
        }

        if(s.toCharArray().sorted() != t.toCharArray().sorted())
            {
                return false;
            }
        return true

    }
}
