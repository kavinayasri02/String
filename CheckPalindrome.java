import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        String rev = "";
        for(int i =k.length()-1;i>=0;i--){
            rev = rev+k.charAt(i);
        }
        if(k.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is a not Palindrome");
        }
    }
}
