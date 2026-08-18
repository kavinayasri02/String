import java.util.Scanner;
public class PrintDupChar {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        String k = kavi.nextLine();
       printDuplicates(k);
}
public static void printDuplicates(String k){
    char[] ch = k.toCharArray();
    System.out.println("Duplicate characters in  " + k + ":");
    for(int i =0;i<ch.length;i++){
        int count = 1;
        if(ch[i] == '0' || ch[i] == ' '){
            continue;
        }
        for(int j =i+1;j<ch.length;j++){
            if(ch[i] == ch[j]){
                count++;
                ch[j] = '0';
            }
        }
        if(count>1){
            System.out.println(ch[i] + " appears "+ count + "times");
        }
    }
}
}
otp : Kavinayasri 
    a appears 3 times
    i appears 2 times
