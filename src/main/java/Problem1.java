public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    The int array is divided into three sections, low, mid, and high. The boudries of low, mid, and high are initially
    set to be 0, 0, and array.length -1. When traversing through the array, if the current variable is 0, it gets shifted into the low section.
    If the variable is 1, it gets kept within the mid section. If the variable is 2, it gets shifted into the high section.

     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp = 0;

        while(mid <= high) {
            //case 1 when 1 encounters another 1
            if(nums[mid] == 1) ++mid;

            //case 2 when 1 encounters a 0
            else if(nums[mid] == 0){
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                ++mid;
                ++low;



            }

            //case 3 when 1 encounters a 2
            else if(nums[mid] == 2){
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                --high;



            }




        }

    }
}
