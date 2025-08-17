package ronaldo.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixnatorTest {

    @Test
    void testPrintFloatMatrixDoesNotThrowException() {
        float[][] matrix = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        Assertions.assertDoesNotThrow(() -> Matrixnator.printFloatMatrix(matrix));
    }

    @Test
    void testPrintDoubleMatrixDoesNotThrowException() {
        double[][] matrix = {{1.0, 2.0}, {3.0, 4.0}};
        Assertions.assertDoesNotThrow(() -> Matrixnator.printDoubleMatrix(matrix));
    }

    @Test
    void testPrintIntMatrixDoesNotThrowException() {
        int[][] matrix = {{1, 2}, {3, 4}};
        Assertions.assertDoesNotThrow(() -> Matrixnator.printIntMatrix(matrix));
    }

    @Test
    void testNullMatrixHandling() {
        Assertions.assertDoesNotThrow(() -> Matrixnator.printFloatMatrix(null));
        Assertions.assertDoesNotThrow(() -> Matrixnator.printDoubleMatrix(null));
        Assertions.assertDoesNotThrow(() -> Matrixnator.printIntMatrix(null));
    }

    @Test
    void testEmptyMatrixHandling() {
        Assertions.assertDoesNotThrow(() -> Matrixnator.printFloatMatrix(new float[0][0]));
        Assertions.assertDoesNotThrow(() -> Matrixnator.printDoubleMatrix(new double[0][0]));
        Assertions.assertDoesNotThrow(() -> Matrixnator.printIntMatrix(new int[0][0]));
    }

    @Test
    void testMatrixWithEmptyRows() {
        Assertions.assertDoesNotThrow(() -> Matrixnator.printFloatMatrix(new float[3][0]));
        Assertions.assertDoesNotThrow(() -> Matrixnator.printDoubleMatrix(new double[3][0]));
        Assertions.assertDoesNotThrow(() -> Matrixnator.printIntMatrix(new int[3][0]));
    }
}