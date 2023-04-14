public class Q3 {
    public static void main(String[] args) {
        /*
Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
         */
        int [] [] numbers={
                {2,4,6,8},
                {1,3,5,7},
        };
for (int row=0;row<numbers.length-1; row++){
    int[]array=numbers[0];
    for (int column=0; column<array.length; column++){
        System.out.print(array[column]+" ");
    }
    System.out.println();

}
    }
}
