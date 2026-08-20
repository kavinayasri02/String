import java.util.Scanner;
public class CountFreqofeveryChar {
    public static void main(String[]args){
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
        char[]ch = k.toCharArray();
        System.out.println("Character Frequencies :");
        for(int i =0;i<ch.length;i++){
           if(ch[i] == '\0'){
            continue;
           }
           int count = 1;
           for(int j = i+1;j<ch.length;j++){
            if(ch[i] == ch[j]){
                count++;
                ch[j] = '\0';
            }
           }
           System.out.println("'" + ch[i] + " ' : " + count);
        }
    }
}
