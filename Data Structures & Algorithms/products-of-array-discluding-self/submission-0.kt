class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        val pref = IntArray(n)
        val suff = IntArray(n)

        pref[0] = 1
        suff[n - 1] = 1
        for (i in 1 until n) {
            pref[i] = nums[i - 1] * pref[i - 1]
        }
        for (i in n - 2 downTo 0) {
            suff[i] = nums[i + 1] * suff[i + 1]
        }
        for (i in 0 until n) {
            res[i] = pref[i] * suff[i]
        }
        return res
    }
}
