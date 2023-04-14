public class Q2 {
    public static void main(String[] args) {
/*
 Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
 */
        int [] values= {40,43,65,34,70,65,32};
        int sum=0;
        for (int ans:values){
            sum=sum+ans;
        }
        System.out.println(sum);
    }
}
