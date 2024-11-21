import java.util.Scanner;
class Students {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("How many students : ");
        int n = s.nextInt();
        Student[] studs = new Student[n];
        for(int i = 0; i<n ; i++){
            studs[i] = new Student();
            System.out.println("Enter student "+(1+i)+" details:\n");
            studs[i].get_details();
            studs[i].calculate_grades();
            studs[i].calculate_sgpa();
            studs[i].display();
            System.out.println("\n -----------------------------\n");
        }
        s.close();
    }
}