public class MatrixSum {
    
    public static int sumRow(int[][] matrix, int row) {
        int sum = 0;
        for (int j = 0; j < matrix[row].length; j++) {
            sum += matrix[row][j];
        }
        return sum;
    }
    
    public static int sumColumn(int[][] matrix, int col) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        return sum;
    }
    
    public static int sumAll(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nSum of row 0: " + sumRow(matrix, 0));
        System.out.println("Sum of column 0: " + sumColumn(matrix, 0));
        System.out.println("Sum of all elements: " + sumAll(matrix));
    }
}
