import java.util.Scanner;
public class Quadratic_eqn{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    double D = b*b - 4*a*c;

if (D > 0) {
    double r1 = (-b + Math.sqrt(D)) / (2*a);
    double r2 = (-b - Math.sqrt(D)) / (2*a);
    System.out.println(r1 + " " + r2);
} else if (D == 0) {
    double r1 = -b / (2*a);
    System.out.println(r1);
} else {
    double r1 = -b / (2*a);
    double r2 = Math.sqrt(-D) / (2*a);
    System.out.println(r1 + " " + r2);
}



    }
}