package assignments;

public class diagonal {
    public static int getRandomSize () {
        
        /* cast the random double value to integer */
        return (int)(Math.random() * 10);
    }

    public static int[][] generateMatrix (int n) {
        int [][] a = new int[n][n];
        
        /* fill in the matrix */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int)(Math.random() * 20);
            }
        }
        return a;
    }

    public static void printMatrix (int[][] matrix) {
        int n = matrix.length;
        /* format the output */
        for (int i = 0; i < n; i++) {

            /* add vertical lines in between columns */
            System.out.printf("|");
            
            /* print the matrix values */
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d |", matrix[i][j]);              
            }
            System.out.println();
            
            /* add horizontal lines in between rows*/
            for(int k = 0; k <= n*5; k++){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static int computeSum (int[][] matrix) {
        int n = matrix.length, leftSum = 0, rightSum = 0;
        
        /* compute the sum */
        for (int i = 0; i < n; i++) {
            leftSum += matrix[i][i];
            rightSum += matrix[i][n-i-1];
        }
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        /* get the size of the matrix */
        int n = getRandomSize();

        /* initialize the matrix */
        int [][] a = new int[n][n];
        
        /* fill in the matrix */
        a = generateMatrix(n);

        /* print the matrix */
        printMatrix(a);

        /* compute the sum of the diagonals and print */
        System.out.println("\nThe sum of the diagonals is =>" + computeSum(a));
    }
}