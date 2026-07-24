class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var str = StringBuilder()
        if(word1.length <= word2.length)
        {
            for(i in word1.indices)
            {
                str.append(word1[i])
                str.append(word2[i])
            }
            str.append(word2.substring(word1.length))
        }
        if(word1.length > word2.length)
        {
            for(i in word2.indices)
            {
                str.append(word1[i])
                str.append(word2[i])
            }
            str.append(word1.substring(word2.length))
        }
        return str.toString()

    }
}
