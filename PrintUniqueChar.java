import java.util.Scanner;
public class PrintUniqueChar {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char[]ch = k.toCharArray();
        System.out.println("Unique Characters:");
        for(int i =0;i<ch.length;i++){
            boolean isUnique = true;
            for(int j =0;j<ch.length;j++){
                if(i!= j&& ch[i] == ch[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.print(ch[i] + " ");
            }
        }
    }
}
otp : Kavinayasri
    k v n y s r


    Using HashSet Method 

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersSet {
    public static void main(String[] args) {
        String str = "javaae";
        
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            // If the character cannot be added, it's a duplicate
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}
