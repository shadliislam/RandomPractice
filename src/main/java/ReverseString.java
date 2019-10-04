public class ReverseString{

    // Main method
    public static void main(String[] args) {
        String input = "The sky is blue";
        System.out.println(reverseWord(input));
    }

    //Reverse the string method
    public static String reverseWord(String input){

        String[] wordsInString=input.split(" ");
        String reversedString="";

        for (int i=0;i<wordsInString.length;i++){
            String word= wordsInString[i];
            String reversedWords="";
            for (int j=word.length()-1;j>=0;j--){
                reversedWords=reversedWords+word.charAt(j);
            }
            reversedString=reversedString+reversedWords+" ";
        }
        return reversedString.toLowerCase();
    }
}