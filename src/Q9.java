public class Q9 {
    public static void main(String[] args) {
        /*
        Write a java program to find the second largest
number in the array
         */
        int largest=0;
        int secondLargest=0;
        int [] nums= {43,67,34,97,35,64,53,7,46,45,43,66,86};
        for (int a=0; a<nums.length;a++){
            if (nums[a]>largest){
                secondLargest=largest;
                largest=nums[a];
            } else if (nums[a]>secondLargest) {
                secondLargest=nums[a];
            }
        }
        System.out.println(secondLargest);
    }
}