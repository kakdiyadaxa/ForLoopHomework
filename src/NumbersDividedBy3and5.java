public class NumbersDividedBy3and5 {
    public static void main(String[] args) {
        //printing numbers divisible by 3
        System.out.println("Numbers divisible by 3:");
        //looping from 1 to 100
        for (int i = 1; i <=100 ; i++) {
            //checking if num is divisible by 3
            if (i % 3 == 0){
                //then printing if yes
                System.out.println(i + " ");
            }
        }
        //printing as statement down below is says
        System.out.println("Numbers divisible by 5:");
        //looping 1 to 100
        for (int i = 1; i <=100 ; i++) {
            //checking if num is divisible by 5
            if (i % 5 ==0){
                //then printing if yes
                System.out.println(i + " ");
            }
        }

    }
}
