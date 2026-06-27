class Solution {
    fun isPalindrome(s: String): Boolean {
        val newString = s.lowercase().filter { it.isLetterOrDigit() }
        val length = newString.length
        if(length == 1)
        {
            return true;
        }
        var a = 0
        var b = length - 1
        while(a<b)
        {
            if(newString[a]==newString[b])
            {
                a++
                b--
                continue;
            }
            return false;
        }
        return true;
    }
}
