import java.util.Scanner;
public class findLastChar {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char last = k.charAt(k.length()-1);
        System.out.print("Last Character: " + last);
    }
}
