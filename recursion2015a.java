public class recursion2015a
{
    public static int shortestPath(int [][] mat) {
        return shortestPath(mat, 0, 0, 0);
    }

    private static int shortestPath(int [][] mat, int prev, int i, int j) {
        if (i<0 || j<0 || i>mat.length-1 || j>mat[0].length-1 || mat[i][j]<=prev || mat[i][j]==0)
            return Integer.MAX_VALUE;
        if (i==mat.length-1 && j==mat[0].length-1)
            return 1;

        prev = mat[i][j];
        mat[i][j] = 0;

        int up = shortestPath(mat, prev, i-1, j);
        int down = shortestPath(mat, prev, i+1, j);
        int left = shortestPath(mat, prev, i, j+1);
        int right = shortestPath(mat, prev, i, j-1);

        mat[i][j] = prev;

        int shortest = Math.min(Math.min(up, down), Math.min(left, right));
        if (shortest == Integer.MAX_VALUE)
            return shortest;

        return 1 + shortest;
    }
}
