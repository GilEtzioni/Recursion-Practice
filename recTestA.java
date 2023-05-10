public class recTestA {
    public static void main(String[] args) {
        int[][] mat1 = {
            {3, 13, 15, 28, 30},
            {40, 51, 52, 29, 30},
            {28, 10, 53, 54, 53},
            {53, 12, 55, 53, 60},
            {70, 62, 56, 20, 80},
            {80, 81, 90, 95, 100}
        };
        int result = recursion2015a.shortestPath(mat1);
        System.out.println("The answer is: " + result);
    }
}
