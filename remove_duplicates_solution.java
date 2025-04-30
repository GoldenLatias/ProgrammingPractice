class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int valid = 0;
        int ptr = 0;
        int[] temp = new int[size];
        temp[ptr++] = nums[0];
        valid++;
        for (int i = 1; i < size; i++) {
            if (nums[i] != temp[ptr-1]) {
                temp[ptr++] = nums[i];
                valid++;
            }
        }
        for (int i = 0; i < size; i++) {
            nums[i] = temp[i];
        }
        return valid;
    }
}