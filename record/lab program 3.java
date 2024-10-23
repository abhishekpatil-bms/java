import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int num_pages;

    Books(String n, String a, int p, int g) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.num_pages = g;
    }

    public String toString() {
        String na, au, pr, nu;
        na = "Name of book: " + this.name + "\n";
        au = "Name of author: " + this.author + "\n";
        pr = "Price of the book: " + this.price + "\n";
        nu = "Number of pages: " + this.num_pages + "\n";
        return na + au + pr + nu;
    }

}

class Books_det {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String name;
        String author;
        int price;
        int n;
        int numPages;
	System.out.println("\nName: Abhishek patil\nUSN: 1BM23CS013\n\n\n");
        System.out.println("Enter number of books: ");
        n = s.nextInt();
        Books b[] = new Books[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Book " + (i + 1) + " details");
            System.out.println("Name: ");
            name = s.next();
            System.out.println(" Author: ");
            author = s.next();
            System.out.println("Price: ");
            price = s.nextInt();
            System.out.println("Number of pages: ");
            numPages = s.nextInt();
            b[i] = new Books(name, author, price, numPages);

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of book " + (i + 1));
            System.out.println(b[i]);
        }
        s.close();

    }
}