import java.util.Scanner;
import java.util.Arrays;
public class check2StringsAnagram{
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        String s = kavi.nextLine();
        if(checkAnagram(k,s)){
           System.out.println("\"" + k + "\" and \"" + s + "\" are Anagrams!");
        }else{
            System.out.println("\"" + k + "\""  + s + "\" are Not Anagrams!");
        }
        }
        public static boolean checkAnagram(String S1,String S2) {
            S1 = S1.replaceAll("\\s", "").toLowerCase();
            S2 = S2.replaceAll("\\s", "").toLowerCase();
            if(S1.length()!= S2.length()){
                return false;
            }
            char [] arr1 = S1.toCharArray();
            char [] arr2 = S2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        }
    }