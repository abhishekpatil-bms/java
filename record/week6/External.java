package SEE;

import CIE.Student;
import java.util.Scanner;

public class External extends Student {
    private int[] externalMarks;

   
    public External(String usn, String name, int sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }

 
    public void displayExternalMarks() {
        System.out.println("External Marks: ");
        for (int i = 0; i < externalMarks.length; i++) {
            System.out.println("Course " + (i + 1) + ": " + externalMarks[i]);
        }
    }

 
    public int calculateExternalTotal() {
        int total = 0;
        for (int mark : externalMarks) {
            total += mark;
        }
        return total;
    }

  
    public static int[] takeExternalMarksInput() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter external marks for 5 courses: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Course " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        return marks;
    }
}
