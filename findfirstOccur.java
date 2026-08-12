import java.util.*;
public class findfirstOccur {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char ch = kavi.next().charAt(0);
        int pos = k.indexOf(ch);
        System.out.print("First Occurence : " + pos);
    }
}
