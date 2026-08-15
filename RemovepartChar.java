import java.util.Scanner;
public class RemovepartChar {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char tgt = kavi.next().charAt(0);
        String res = "";
        for(int i =0;i<k.length();i++){
            char currChar = k.charAt(i);
            if(currChar != tgt){
                res += currChar;
            }
        }
    System.out.print("String after removal of a particular character : " + res);
    }
}
