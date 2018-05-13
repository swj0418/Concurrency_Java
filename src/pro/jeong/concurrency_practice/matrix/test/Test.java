package pro.jeong.concurrency_practice.matrix.test;

import pro.jeong.concurrency_practice.matrix.JMat;

public class Test {
    public static void main(String[] ar) {
        JMat mat = new JMat(100, 100, 10000);
        mat.printJMat();
    }
}
