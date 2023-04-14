public class Q4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array
         */
        int[][] numbers = {
                {2, 4, 6, 8},
                {1, 3, 5, 7},
                {4, 6, 8, 3,}
        };

        int sumAllEven = 0;
        int sumAllOdd = 0;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers.length + 1; b++) {
                if (numbers[a][b] % 2 == 0) {
                        sumAllEven+= numbers[a][b];
                    System.out.println("Even " +numbers[a][b]);

                } else {
                    sumAllOdd+= numbers[a][b];
                    System.out.println("Odd "+numbers[a][b]);
                }
                System.out.println();
            }

        }
        System.out.println("Sum of Even elements:"+sumAllEven);
        System.out.println("Sum of Even elements:"+sumAllOdd);
    }
}
