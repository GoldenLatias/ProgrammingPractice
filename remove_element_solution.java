class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int valid = 0;
        int ptr = 0;
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
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