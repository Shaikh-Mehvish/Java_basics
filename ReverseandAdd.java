import java.util.Scanner;
public class ReverseandAdd{
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
       
            int num = sc.nextInt();
            int orig_num = num;

            int digit = 0;
            int rev = 0;

            for(int i = 0; i < num; i++){
                digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if(orig_num == rev){
                System.out.println("Yes");
            }
    }
}