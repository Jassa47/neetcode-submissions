class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var list = mutableListOf<Int>()
        for (num in nums) {
            if (num != `val`) {
                list.add(num)
            }
        }
        

        for (i in list.indices) {
            nums[i] = list[i]
        }

return list.size
    }
}
