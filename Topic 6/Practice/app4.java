public class app4 {
    public static void main(String[] args) {
        System.out.println("Array");
        int[][] mat1 = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] mat2 = { { 3, 2, 1 },
                { 6, 5, 4 } };
        int[][] res = { { 0, 0, 0 },
                { 0, 0, 0 } };
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(res[i][j] + " ");
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}
