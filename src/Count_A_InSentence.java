public class Count_A_InSentence {
    //main method
    public static void main(String[] args) {

        //initializing the count variable to 0

        int count = 0;
        String name = "My name is Daxa Kakdiya.";
        System.out.println("The entered string is: "+name);

        //looping through each character in the string
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a'){
                //incrementing the count variable if the current character is 'a'
                count++;
            }

        }
        //printing the total count of 'a' in the string
        System.out.println("Total number of 'a' in the string: " +count);
    }
}
