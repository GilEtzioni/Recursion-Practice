public class recursion2015aa
{
    public static int countRopes(int[][] mat) {
        return countRopes(mat, -1, 0, 0);
    }

    private static int countRopes(int[][] mat, int prev, int i, int j) {
        if(i == mat.length || j == mat[0].length || i <0 || j < 0)
            return 0;
        if(mat[i][j] >= prev && prev != -1)
            return 0;
        if(i == mat.length-1)
            return 1;

        prev = mat[i][j];

        int left = countRopes(mat, prev, i+1, j-1);
        int right = countRopes(mat, prev, i+1, j+1);
        int down = countRopes(mat, prev, i+1, j);

        int count = left +right + down;

        if(i == 0)
            return count + countRopes(mat,-1,i,j+1);
        return count;
    }
}
