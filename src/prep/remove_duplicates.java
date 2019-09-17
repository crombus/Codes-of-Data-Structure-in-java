class remove_duplicates{

    public int _remove_duplicate_sorted_array(int[] nums) {
        //remove duplicates from sorted array 
    /*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
      Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
      Example 1:
      Given nums = [1,1,2], Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
      It doesn't matter what you leave beyond the returned length.
      link--> https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */
        int sum = 1, flag = 0;
        for(int i = 0;i<nums.length - 1;i++){
            int var = nums[i];
            if(var != nums[i + 1]){
                sum++;
                flag++;
                nums[flag] = nums[i + 1];
            }
        }
        /*Runtime: 1 ms, faster than 96.84% of Java online submissions for Remove Duplicates from Sorted Array.
          Memory Usage: 39.3 MB, less than 99.47% of Java online submissions for Remove Duplicates from Sorted Array.*/
        return sum;
    }}
