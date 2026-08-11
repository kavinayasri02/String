import java.util.Scanner;
public class countVowels {
    public static void main(String[]args){
       Scanner kavi = new Scanner(System.in);
       String s = kavi.nextLine();
       int count = 0;
       for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
       }
       System.out.print("Number of vowels in the String is :" + count);
    }
}
