import java.util.Scanner;
public class SimplyEmirp{
  
        public static boolean isprime(int x){
            if(x < 2)
                return false;
            else if(x == 2)
                return true;
            else if(x % 2 == 0)
                return false;
            else{
                for(int i = 2; i < x; i++){
                    if(x % i == 0)
                        return false;  
                }  
                return true; 
            }
        }

        public static int reverse(int x){
            int digit = 0;
            int rev = 0;
            for(int i = 0; i < x; i++){
                digit = x % 10;
                rev = rev * 10 + digit;
                x = x / 10;
            }
            return rev;
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rev = reverse(n);
        boolean result = isprime(n);
        boolean result2 = isprime(rev);
        if(result)
            System.out.println(n +" " + "is prime");
        else if(result2 && result)
            System.out.println(rev +" " + "is Emirp");
        else
            System.out.println(n +" " + "is not prime");        
    }
}