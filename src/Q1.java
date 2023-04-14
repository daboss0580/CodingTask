public class Q1 {
    public static void main(String[] args) {
/*
 Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
        int[] tempInDegreeC = {4, 12, 21, 6, 25, 8, 30, 18};
        int largestTemp = tempInDegreeC[0];
        for (int temp : tempInDegreeC) {
            if (temp > largestTemp) {
                largestTemp = temp;
            }
        }
        System.out.println(largestTemp);
        System.out.println();
        int lowestTemp = tempInDegreeC[0];
        for (int temp : tempInDegreeC) {
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }
        System.out.println(lowestTemp);
    }
}
