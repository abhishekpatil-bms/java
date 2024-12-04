
abstract class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double printArea();
}

class Rect extends Shape {
    Rect(double a, double b) {
        super(a, b);
    }

    double printArea() {
        System.out.printf("The area of the Rectangle is: " + (dim1 * dim2) + "\n");
        return 0;
    }

}

class Tri extends Shape {
    Tri(double a, double b) {
        super(a, b);
    }

    double printArea() {
        System.out.printf("The area of the Triangle is: " + ((dim1 * dim2) / 2) + "\n");
        return 0;
    }
}

class Cir extends Shape {
    Cir (double a, double b) {
        super(a, b);
    }

    double printArea() {
        System.out.printf("The area of the Circle is: " + (3.14 * dim1 * dim1) + "\n");
        return 0;
    }
}

class Area {
    public static void main(String[] args) {
        System.out.println("\nName: Abhishek paitl\nUSN: 1BM23CS013\n\n");
        Rect r = new Rect(7, 9);
        Tri t = new Tri(5, 10);
        Cir c = new Cir(7, 15);
        Shape s;
        s = r;
        s.printArea();
        s = t;
        s.printArea();
        s = c;
        s.printArea();
    }
}