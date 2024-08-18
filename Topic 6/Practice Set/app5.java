public class app5 {
    public static void main(String[] args) {
        System.out.println("Practice Set Question 4");
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 } };
        int[][] mat2 = { { 2, 3, 4 },
                { 7, 8, 9 } };
        int[][] result = { { 0, 0, 0 },
                { 0, 0, 0 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                result[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}