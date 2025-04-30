class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] row : matrix) {
            int leftPointer = 0;
            int rightPointer = row.length - 1;
            while (leftPointer < rightPointer) {
                int temp = row[rightPointer];
                row[rightPointer] = row[leftPointer];
                row[leftPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }
    }
}