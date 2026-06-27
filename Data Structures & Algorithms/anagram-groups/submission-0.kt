class Solution {
    fun sortString(s: String): String 
    {
        return s.toCharArray().sorted().joinToString("")
    }
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
           val map = HashMap<String, MutableList<String>>()
    for (s in strs) {
        val key = sortString(s)
        map.getOrPut(key) { mutableListOf() }.add(s)
    }
    return map.values.toList()
    }
}
