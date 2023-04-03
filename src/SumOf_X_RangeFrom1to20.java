public class SumOf_X_RangeFrom1to20 {
        //main method
    public static void main(String[] args) {
        System.out.println("The sum of x ranging from 1 to 20 is: ");

        int sum = 0;

        //calculate the sum of x ranging 1 to 20
        //sum of x-range like 1+2+3+....+20
        for (int i = 1; i <=20 ; i++) {
            System.out.println(i * (i+1)/2);
        }

    }
}
