package valencia.java;

public class MatrixDifference {
    static int rows = 3;
    static int[][] mat = {{1,2,3},{4,5,6},{9,8,9}};
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j<3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int left = 0;
        int right = 0;
        for(int i = 0; i < rows; i++) {
            left += mat[i][i];
        }
        for(int i = 0; i < rows; i++) {
            right += mat[i][rows-1-i];
        }
        System.out.println(left);
        System.out.println(right);
    }
}
