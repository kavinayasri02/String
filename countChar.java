import java.util.*;
public class countChar {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String s = kavi.nextLine();
        for(int i =0;i<s.length();i++){
            int count  = 0;
            for(int j =0;j<s.length();j++){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
        }
        System.out.println("Number of the character in the string is: "+ count);
    }
}
}