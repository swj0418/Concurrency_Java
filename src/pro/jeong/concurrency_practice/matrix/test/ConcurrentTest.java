package pro.jeong.concurrency_practice.matrix.test;

import pro.jeong.concurrency_practice.matrix.matrixoper.ParallelIndividualMultiplier;
import pro.jeong.concurrency_practice.matrix.matrixutil.MatrixGenerator;

import java.util.Date;

public class ConcurrentTest {
    public static void main(String[] ar) {
        double[][] mat1 = MatrixGenerator.generateMatrix(500, 500);
        double[][] mat2 = MatrixGenerator.generateMatrix(500, 500);
        double[][] result = new double[mat1.length][mat2[0].length];

        Date start = new Date();
        ParallelIndividualMultiplier.multiply(mat1, mat2, result);
        System.out.println("Time taken : " + (new Date().getTime() - start.getTime()));

    }
}
