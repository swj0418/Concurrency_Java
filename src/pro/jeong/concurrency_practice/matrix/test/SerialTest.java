package pro.jeong.concurrency_practice.matrix.test;

import pro.jeong.concurrency_practice.matrix.matrixoper.SerialOperation;
import pro.jeong.concurrency_practice.matrix.matrixutil.MatrixGenerator;

import java.util.Date;

public class SerialTest {
    public static void main(String[] ar) {
        double[][] mat1 = MatrixGenerator.generateMatrix(1000, 200);
        double[][] mat2 = MatrixGenerator.generateMatrix(200, 1000);
        double[][] result = new double[mat1.length][mat2[0].length];

        Date start = new Date();
        SerialOperation.multiply(mat1, mat2, result);
        System.out.println("Time taken : " + (new Date().getTime() - start.getTime()));

    }
}
