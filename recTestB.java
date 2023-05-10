public class recTestB {
    public static void main(String[] args) {
        int[][] mat1 = {
                {0, 0, 0, 10, 0, 0},
                {0, 0, 8, 0, 9, 0},
                {0, 6, 0, 0, 0, 7},
                {3, 0, 4, 0, 0, 5},
                {1, 2, 0, 0, 0, 2},
            };

        int[][] mat2 = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 4},
                {3, 4, 5, 4, 3},
                {4, 5, 4, 3, 2},
                {5, 4, 3, 2, 1},
            };

        int result = recursion2015aa.countRopes(mat1);
        System.out.println("The answer is: " + result);
    }
}
