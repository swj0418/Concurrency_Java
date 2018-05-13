package pro.jeong.concurrency_practice.matrix.matrixoper;

public class IndividualMultiplierTask implements Runnable {
    private final double[][] result;
    private final double[][] matrix1;
    private final double[][] matrix2;

    private final int row;
    private final int col;

    public IndividualMultiplierTask(double[][] matrix1, double[][] matrix2, double[][] result, int row, int col) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = row;
        this.col = col;
    }

    public void run() {
        result[row][col] = 0;
        for(int k = 0; k < matrix1[row].length; k++) {
            result[row][col] += matrix1[row][k] * matrix2[k][col];
        }
    }
}
