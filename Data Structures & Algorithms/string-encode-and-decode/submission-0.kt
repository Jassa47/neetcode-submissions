class Solution {

   fun encode(strs: List<String>): String {
    val sb = StringBuilder()
    for (s in strs) {
        sb.append(s.length).append('#').append(s)
    }
    return sb.toString()
}

   fun decode(s: String): List<String> {
    val result = mutableListOf<String>()
    var i = 0
    while (i < s.length) {
        // 1. read digits until '#' to get the length
        var j = i
        while (s[j] != '#') j++
        val length = s.substring(i, j).toInt()

        // 2. the string is the next `length` chars after the '#'
        val str = s.substring(j + 1, j + 1 + length)
        result.add(str)

        // 3. jump past this whole chunk to the start of the next
        i = j + 1 + length
    }
    return result
}
}
