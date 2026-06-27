class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val length = numbers.size
        var a=0
        var b= length-1
        val temp= IntArray(2)
        while( a<b)
        {
            if(numbers[a]+numbers[b] > target)
            {
                b--
            }
            else if(numbers[a]+numbers[b] < target)
            {
                a++
            }
            else
            {
                temp[0]=a+1;
                temp[1]=b+1;
                return temp;
            }
        }
        return temp;
    }
}
