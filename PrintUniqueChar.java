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
