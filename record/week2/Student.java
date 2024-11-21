import java.util.Scanner;
public class Student {
        String name,usn;
        double sgpa;
        int[] marks = new int[8];
        int[] credits = new int[8];
        int[] grades = new int[8];

        void get_details(){
            Scanner s = new Scanner(System.in);
            System.out.printf("Enter Student name: ");
            name = s.nextLine();
            System.out.printf("Enter USN: ");
            usn = s.nextLine();
            System.out.printf("Enter marks of each subject and their credits respectively: \n\n");
            for(int i=0; i<8 ; i++){
                System.out.printf("sub "+(i+1)+" marks:");
                marks[i] = s.nextInt();
                System.out.printf("sub "+(i+1)+" credit: ");
                credits[i] = s.nextInt();
                System.out.println();
            }
            s.close();
        }
        void calculate_grades(){
            for(int i=0; i<8 ; i++){
                if(marks[i] == 100){
                    grades[i] = 10;
                }
                else{
                    grades[i] = (marks[i]/10)+1;
                }

            }
        }
        void calculate_sgpa(){
            double  a = 0,b = 0;
            for(int i=0 ; i<8  ; i++){
                a = a + (grades[i] * credits[i]);
                b = b + credits[i];
            }
            sgpa = a/b;
        }
        void display(){
            System.out.println("Name :"+name);
            System.out.println("USN :"+usn);
            System.out.printf("SGPA : %.2f",sgpa);

        }
}
