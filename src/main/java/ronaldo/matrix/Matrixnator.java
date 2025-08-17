package ronaldo.matrix;

/**
 * A utility class to print matrices in a formatted, human-readable way.
 * This class provides methods to handle different primitive matrix types (float, double, int).
 */
public class Matrixnator {

    /**
     * Prints a 2D matrix of floats with a professional, formatted grid.
     * The values are centered in a 7-character wide cell with 2 decimal places.
     *
     * @param matrix The 2D float array to be printed.
     */
    public static void printFloatMatrix(float[][] matrix) {
        printMatrix(matrix, 7, 2);
    }

    /**
     * Prints a 2D matrix of doubles with a professional, formatted grid.
     * The values are centered in a 7-character wide cell with 2 decimal places.
     *
     * @param matrix The 2D double array to be printed.
     */
    public static void printDoubleMatrix(double[][] matrix) {
        printMatrix(matrix, 7, 2);
    }

    /**
     * Prints a 2D matrix of integers with a professional, formatted grid.
     * The values are centered in a 7-character wide cell.
     *
     * @param matrix The 2D int array to be printed.
     */
    public static void printIntMatrix(int[][] matrix) {
        printMatrix(matrix, 7, 0);
    }

    // Método privado genérico para lidar com a lógica de impressão
    private static void printMatrix(Object matrix, int cellWidth, int decimalPlaces) {
        if (matrix == null) {
            System.out.println("Empty or null matrix.");
            return;
        }

        int numLinhas;
        int numColunas;

        if (matrix instanceof float[][]) {
            float[][] m = (float[][]) matrix;
            numLinhas = m.length;
            numColunas = (numLinhas > 0) ? m[0].length : 0;
            if (numLinhas == 0 || numColunas == 0) {
                System.out.println("Empty or null matrix.");
                return;
            }
            printFrame(numColunas, "┌", "┬", "┐");
            for (int l = 0; l < numLinhas; l++) {
                System.out.print("│");
                for (int c = 0; c < numColunas; c++) {
                    String value = String.format("%." + decimalPlaces + "f", m[l][c]);
                    printCenteredValue(value, cellWidth);
                    System.out.print("│");
                }
                System.out.println();
                if (l < numLinhas - 1) {
                    printFrame(numColunas, "├", "┼", "┤");
                }
            }
        } else if (matrix instanceof double[][]) {
            double[][] m = (double[][]) matrix;
            numLinhas = m.length;
            numColunas = (numLinhas > 0) ? m[0].length : 0;
            if (numLinhas == 0 || numColunas == 0) {
                System.out.println("Empty or null matrix.");
                return;
            }
            printFrame(numColunas, "┌", "┬", "┐");
            for (int l = 0; l < numLinhas; l++) {
                System.out.print("│");
                for (int c = 0; c < numColunas; c++) {
                    String value = String.format("%." + decimalPlaces + "f", m[l][c]);
                    printCenteredValue(value, cellWidth);
                    System.out.print("│");
                }
                System.out.println();
                if (l < numLinhas - 1) {
                    printFrame(numColunas, "├", "┼", "┤");
                }
            }
        } else if (matrix instanceof int[][]) {
            int[][] m = (int[][]) matrix;
            numLinhas = m.length;
            numColunas = (numLinhas > 0) ? m[0].length : 0;
            if (numLinhas == 0 || numColunas == 0) {
                System.out.println("Empty or null matrix.");
                return;
            }
            printFrame(numColunas, "┌", "┬", "┐");
            for (int l = 0; l < numLinhas; l++) {
                System.out.print("│");
                for (int c = 0; c < numColunas; c++) {
                    String value = String.valueOf(m[l][c]);
                    printCenteredValue(value, cellWidth);
                    System.out.print("│");
                }
                System.out.println();
                if (l < numLinhas - 1) {
                    printFrame(numColunas, "├", "┼", "┤");
                }
            }
        } else {
            System.out.println("Unsupported matrix type.");
        }

        System.out.println("Printed by Matrixnator.");
    }

    private static void printFrame(int numColunas, String start, String separator, String end) {
        System.out.print(start);
        for (int c = 0; c < numColunas; c++) {
            System.out.print("───────");
            if (c < numColunas - 1) System.out.print(separator);
        }
        System.out.println(end);
    }

    private static void printCenteredValue(String value, int cellWidth) {
        int padding = cellWidth - value.length();
        int leftPadding = padding / 2;
        int rightPadding = padding - leftPadding;

        for (int i = 0; i < leftPadding; i++) System.out.print(" ");
        System.out.print(value);
        for (int i = 0; i < rightPadding; i++) System.out.print(" ");
    }
}