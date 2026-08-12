import java.util.*;
public class findLastOccur {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char ch = kavi.next().charAt(0);
        int pos = k.lastIndexOf(ch);
        System.out.print("Last Occurences :" + pos);
    }
}
