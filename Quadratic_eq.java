import java.util.Scanner;

class Quadratic_eq{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		double r1,r2,d;
		System.out.printf("\nUSN: 1BM23CS013 \n NAME: Abhishek patil\n");
		System.out.printf("Enter a= ");
		a=s.nextInt();
		System.out.printf("Enter b= ");
		b=s.nextInt();
		System.out.printf("Enter c= ");
		c=s.nextInt();
		d = (b*b)-(4*a*c);
		if(d>0){
		r1= (-b+Math.sqrt(d))/(2*a);
		r2= (-b-Math.sqrt(d))/(2*a);
		System.out.printf("Roots are real and unique\nRoot 1= %.2f\nRoot 2= %.2f",r1,r2);
		}
		else if(d==0){
		r1=-b/(2*a);
		System.out.printf("Roots are real and equal\nRoot 1= %.2f \nRoot 2= %.2f",r1,r1);
		}
		else{
		r1=-b/(2*a);
		r2=(Math.sqrt(-d))/(2*a);
		System.out.printf("Roots are imaginary and unique \nRoot 1= %.2f+%.2fi \n Root 2= %.2f-%.2fi",r1,r2,r1,r2);
		}
		

	s.close();
	}
}

