import java.util.Scanner;
public class Quadratic_eq{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double r1,r2;
        System.out.println("NAME : ABHISHEK PATIL\nUSN : 1BM23CS013");
        System.out.print("Enter a = ");
        int a = s.nextInt();
        System.out.print("Enter b = ");
        int b = s.nextInt();
        System.out.print("Enter c = ");
        int c = s.nextInt();
        double d = (b*b)-4*a*c;
        if( d > 0){
            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.print("Roots are real and unique!");
            System.out.printf("%n r1 = %.2f%n r2 = %.2f%n", r1, r2);


        }else if(d==0){
            r1 = -b/(2*a);
            r2 = r1;
            System.out.println("Roots are real and equal!");
            System.out.printf("r1 = %.2f /nr2 = %.2f",r1,r2);
        }else{
            System.out.println("Roots are imaginary1");
            r1 = -b/(2*a);
            r2 = Math.sqrt(-d)/(2*a);
            System.out.printf("r1 = %.2f+%.2fi\n",r1,r2);
            System.out.printf("r2 = %.2f-%.2fi",r1,r2);
        }
    s.close();
    }
}