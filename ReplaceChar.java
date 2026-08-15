import java.util.Scanner;
public class ReplaceChar {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char ch = kavi.next().charAt(0);
        char change = kavi.next().charAt(0);
        String res = "";
        for(int i =0;i<k.length();i++){
           char currChar = k.charAt(i);
           if(currChar == ch){
            res += change;
           }else{
            res += currChar;
           }
        }
        System.out.print("String After replacing the Character :" + res);
    }
}
