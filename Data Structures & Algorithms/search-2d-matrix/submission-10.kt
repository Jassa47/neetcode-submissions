class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size
        var top = 0
        var bot = rows - 1

        while (top <= bot) {
            val row = (top + bot) / 2
            if (target > matrix[row][cols - 1]) {
                top = row + 1
            } else if (target < matrix[row][0]) {
                bot = row - 1
            } else {
                break
            }
        }

        if (!(top <= bot)) return false
        val row = (top + bot) / 2
        var l = 0
        var r = cols - 1
        while (l <= r) {
            val m = (l + r) / 2
            if (target > matrix[row][m]) {
                l = m + 1
            } else if (target < matrix[row][m]) {
                r = m - 1
            } else {
                return true
            }
        }
        return false
    }
}