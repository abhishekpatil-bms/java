import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("Enter student details:");

      
        System.out.print("Enter USN: ");
        String usn = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Semester: ");
        int sem = scanner.nextInt();
        scanner.nextLine(); 

       
        int[] internalMarks = Internals.takeInternalMarksInput();
      
        Internals internals = new Internals(usn, name, sem, internalMarks);
        internals.displayDetails();
        internals.displayInternalMarks();

      
        int[] externalMarks = External.takeExternalMarksInput();
        
      
        External external = new External(usn, name, sem, externalMarks);
        external.displayExternalMarks();

      
        int totalInternalMarks = internals.calculateInternalTotal();
        int totalExternalMarks = external.calculateExternalTotal();
        System.out.println("Total Internal Marks: " + totalInternalMarks);
        System.out.println("Total External Marks: " + totalExternalMarks);
        System.out.println("Final Marks (Internal + External): " + (totalInternalMarks + totalExternalMarks)/2);
    }
}

