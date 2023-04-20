public class Q10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from
an Array of Strings
         */

        String []  name= {"Asghar", "Syntax","Pratyush", "Sia", "Sumair", "Mozzam", "Pratyush"};
        for (int a=0; a<name.length; a++){
            for (int b=a+1; b<name.length; b++){
                if (name[a].equals(name[b])){
                    System.out.println(name[b]);
                }
            }
        }
    }
}
