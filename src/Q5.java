public class Q5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a
temporary variable?
         */
        int number1=85;
        int number2=60;
        System.out.println("Before swap, first is "+number1+" and second is "+number2 );
        number1=number1-number2;
        number2=number1+number2;
        number1=number2-number1;
        System.out.println("After swap, first is "+number1+" and second is "+number2 );
    }
}

