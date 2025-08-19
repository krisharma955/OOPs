public class OCP {
    static abstract class Shape {
        abstract double calculateArea();
    }

    public static class Rectangle extends Shape {
        double calculateArea() {
            return 0; //logic
        }
    }

    public static class Circle extends Shape {
        double calculateArea() {
            return 0; //logic
        }
    }
    public static void main(String[] args) {
        //OCP -> A class should be open for extension, but closed for modification
    }
}
