import java.util.Scanner;
public class Freq_char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        char ch = sc.next().charAt(0);

        int count = 0;
        for(int i =0; i < str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch))
                count++;
        }

        System.out.println(count);
    }
}