class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for(i in tokens)
        {
            when(i)
            {
                "+" -> 
                {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b+a)
                }
                "-" ->
                {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b-a)
                }
                "*" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b * a)
                }
                "/" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.addLast(b / a)
                }
                else -> stack.addLast(i.toInt())
            }
        }
        return stack.last()

    }
}
