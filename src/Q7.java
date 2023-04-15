public class Q7 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of
Fibonacci series. 0,1,1,2,3,5,8,13,21,34
         */
int num1=0, num2=1, total=0;
        System.out.print(num1+" "+num2+" ");
        for (int a=2; a<10; a++ ){
            total=num1+num2;
            System.out.print(total+" ");
            num1=num2;
            num2=total;
        }
    }
}
