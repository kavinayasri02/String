import java.util.*;
public class countSpaces{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String s = kavi.nextLine();
        int count = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.print("Number of spaces in the String is :" + count);
    }
}