public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    I have an int variable that keeps track of the number of unique array elements with different values. As soon as there is
    an element with a value different from the previous one, that value will be assigned to the current front of the array.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if (nums.length == 0) return 0;

        int num = 1;


        if(nums.length == 1) return 1;

            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] > nums[i - 1]) {

                    nums[num] = nums[i];
                    ++num;

                }}



            return num;



    }}

