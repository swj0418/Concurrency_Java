package pro.jeong.concurrency_practice.matrix;

import pro.jeong.concurrency_practice.matrix.matrixutil.MatrixGenerator;

public class JMat {
    int DEFAULT_ROW = 1000;
    int DEFUALT_COL = 1000;

    int row_size = 0;
    int column_size = 0;
    private double[][] matrix = new double[DEFAULT_ROW][DEFUALT_COL];

    public JMat() {

    }

    public JMat(double[][] matrix_in_list) {
        matrix = new double[matrix_in_list[0].length][matrix_in_list.length];
        row_size = matrix[0].length;
        column_size = matrix.length;
        matrix = matrix_in_list.clone();
    }

    public JMat(int row, int col) {
        row_size = row;
        column_size = col;
        matrix = MatrixGenerator.generateMatrix(row, col);
    }

    public JMat(int row, int col, int numRange) {
        row_size = row;
        column_size = col;
        matrix = MatrixGenerator.generateMatrix(row, col, numRange);
    }

    public double[][] getJMat() {
        return matrix;
    }

    public void printJMat() {
        for(int r = 0; r < row_size; r++) {
            for(int c = 0; c < column_size; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
