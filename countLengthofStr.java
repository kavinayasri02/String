import java.util.*;
public class countLengthofStr {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String s = kavi.nextLine();
        int count = 0;
        for(int i =0;i<s.length();i++){
            count++;
        }
        System.out.print("Length of the string is :" + count);
    }
}
