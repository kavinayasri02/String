import java.util.Scanner;

public class Check2Stringswithoutusingequals {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String s1 = kavi.nextLine();
        String s2 = kavi.nextLine();
        if(StringEqual(s1,s2)){
            System.out.println("The Strings are EQUAL");
        }else{
            System.out.println("The Strings are NOT EQUAL");
        }
    }
    public static boolean StringEqual(String k1,String k2){
        if(k1 == k2){
            return true;
        }
        if(k1 == null || k2 == null){
            return false;
        }
        if(k1.length()!= k2.length()){
            return false;
        }
        for(int i =0;i<k1.length();i++){
            if(k1.charAt(i)!= k2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
