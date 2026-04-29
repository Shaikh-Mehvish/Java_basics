import java.util.Scanner;

public class Remove_spaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String m = str.replace(" ", "");
        System.out.println(m);
    }
}