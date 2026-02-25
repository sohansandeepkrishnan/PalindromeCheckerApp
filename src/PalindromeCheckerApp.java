public class PalindromeCheckerApp {
    public static void main(String[] args){
       //uc3
        String word = "level";
        String reversed = "";
        for(int i=word.length()-1;i>=0;i--) {
            reversed += word.charAt(i);
        }
        if (word.equals(reversed)){
            System.out.println(word + "is a Palindrome");
        }else{
            System.out.println(word + "is not a Palindrome");
        }
    }
}

