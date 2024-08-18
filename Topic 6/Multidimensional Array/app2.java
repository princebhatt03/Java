public class app2 {
    public static void main(String[] args) {
        System.out.println("3-D Arrays");
        int[][][] flats = new int[2][3][4];
        flats[0][0][0] = 000;
        flats[0][0][1] = 001;
        flats[0][0][2] = 002;
        flats[0][1][0] = 010;
        flats[0][1][1] = 011;
        flats[0][1][2] = 012;
        flats[0][2][0] = 020;
        flats[0][2][1] = 021;
        flats[0][2][2] = 022;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                for (int j2 = 0; j2 < flats[i][j].length; j2++) {
                    System.out.println(flats[i][j][j2]);
                }
            }
        }
    }
}
