class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
           val window = HashSet<Char>()
    var l = 0
    var res = 0
    for (r in s.indices) {
        while (s[r] in window) {   // shrink until the dup is gone
            window.remove(s[l])
            l++
        }
        window.add(s[r])
        res = maxOf(res, r - l + 1)
    }
    return res
    }
}
