package pro.jeong.concurrency_practice.matrix.matrixutil;
import java.lang.Math.*;
import java.util.Random;

public class MatrixGenerator {
    public static double[][] generateMatrix(int row, int col) {
        double[][] retMat = new double[row][col];
        Random random = new Random();
        random.setSeed(java.lang.System.currentTimeMillis());
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                retMat[r][c] = random.nextDouble();
            }
        }
        return retMat;
    }

    public static double[][] generateMatrix(int row, int col, int numRange) {
        double[][] retMat = new double[row][col];
        Random random = new Random();
        random.setSeed(java.lang.System.currentTimeMillis());
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                retMat[r][c] = random.nextDouble() * numRange + 1;
            }
        }
        return retMat;
    }
}
