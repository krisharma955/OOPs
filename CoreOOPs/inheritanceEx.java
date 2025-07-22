package CoreOOPs;

public class inheritanceEx {
    static class Product {
        private String name;
        private String category;
        private double price;
        Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }
        void displayDetails() {
            System.out.println("Name: " +name);
            System.out.println("Price: " +price);
            System.out.println("Category: " +category);
        }
    }
    static class Electronics extends Product {
        private int warrantyPeriod;
        private String brand;
        Electronics(int warrantyPeriod, String brand, String name, double price) {
            super(name, "Electronics", price);
            this.warrantyPeriod = warrantyPeriod;
            this.brand = brand;
        }
        void displayDetails() {
            super.displayDetails();
            System.out.println("Warranty: " +warrantyPeriod);
            System.out.println("Brand: " +brand);
        }
    }
    static class Tshirt extends Product {
        private String size;
        private String color;
        Tshirt(String size, String color, String name, double price) {
            super(name, "Tshirt", price);
            this.size = size;
            this.color = color;
        }
        void displayDetails() {
            super.displayDetails();
            System.out.println("Size: " +size);
            System.out.println("Color: " +color);
        }
    }
    public static void main(String[] args) {
        Electronics electronics = new Electronics(2, "Apple", "Macbook Air", 100000);
        electronics.displayDetails();
    }
}
