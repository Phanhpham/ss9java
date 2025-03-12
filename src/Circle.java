public class Circle {
    // Thuộc tính của hình tròn
    double radius;

    // Constructor mặc định (radius = 1.0)
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Phương thức hiển thị thông tin
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        //  Circle với constructor mặc định
        Circle circle1 = new Circle();
        System.out.println("Circle 1 (Constructor mac dinh):");
        circle1.display();

        //  Circle với constructor có tham số
        Circle circle2 = new Circle(5.0);  // Bán kính là 5
        System.out.println("\nCircle 2 ( Constructor co tham so ):");
        circle2.display();
    }
}
