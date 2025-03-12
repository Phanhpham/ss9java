
public class Rectangle {
    // Thuộc tính của hình chữ nhật
    double length;
    double width;

    // Constructor mặc định
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return length * width;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    //  hiển thị thông tin
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        // Tạo đối tượng Rectangle với constructor mặc định
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 ( Constructor mac dinh ):");
        rect1.display();

        // Tạo đối tượng Rectangle với constructor có tham số
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("\nHình chữ nhật 2 (Constructor có tham số):");
        rect2.display();
    }
}
