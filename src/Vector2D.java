public class Vector2D {
    // Thuộc tính của vector
    double x;
    double y;

    // Constructor khởi tạo vector với x và y
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức tính độ dài của vector
    public double calculateMagnitude() {
        // vector = sqrt(x^2 + y^2)
        return Math.sqrt(x * x + y * y);
    }

    // Phương thức cộng hai vector
    public Vector2D add(Vector2D v) {
        // cong 2 vector
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    // Phương thức trừ hai vector
    public Vector2D subtract(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    // Phương thức tính tích vô hướng giữa hai vector
    public double dotProduct(Vector2D v) {
        //  x1*x2 + y1*y2
        return this.x * v.x + this.y * v.y;
    }

    // Phương thức hiển thị thông tin vector
    public void displayVector() {
        System.out.println("Vector: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        // Tạo hai vector khác nhau
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        // Hiển thị thông tin của các vector
        System.out.println("Vector 1:");
        v1.displayVector();
        System.out.println("Vector 2:");
        v2.displayVector();

        // Tính và hiển thị độ dài của vector
        System.out.println("Độ dài của Vector 1: " + v1.calculateMagnitude());
        System.out.println("Độ dài của Vector 2: " + v2.calculateMagnitude());

        // Tính và hiển thị tổng và hiệu của hai vector
        Vector2D sum = v1.add(v2);
        Vector2D difference = v1.subtract(v2);

        System.out.println("Tổng của Vector 1 và Vector 2:");
        sum.displayVector();
        System.out.println("Hiệu của Vector 1 và Vector 2:");
        difference.displayVector();

        // Tính và hiển thị tích vô hướng của hai vector
        System.out.println("Tích vô hướng của Vector 1 và Vector 2: " + v1.dotProduct(v2));
    }
}
