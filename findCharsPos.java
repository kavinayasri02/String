import java.util.*;
public class findCharsPos {
    public static void main(String[]args){
      Scanner kavi = new Scanner(System.in);
      String k = kavi.nextLine();
      char ch = kavi.next().charAt(0);
      int pos = k.indexOf(ch);
      System.out.print("The Position of the element : " + pos);
    }
}
