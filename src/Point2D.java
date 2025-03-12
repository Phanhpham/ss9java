public class Point2D {
    // Thuộc tính của điểm
    double x;  double y;

    // Constructor có tham số
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức getX: Trả về tọa độ x của điểm
    public double getX() {
        return this.x;
    }

    // Phương thức getY: Trả về tọa độ y của điểm
    public double getY() {
        return this.y;
    }

    // Phương thức setX: Cập nhật tọa độ x của điểm
    public void setX(double x) {
        this.x = x;
    }

    // Phương thức setY: Cập nhật tọa độ y của điểm
    public void setY(double y) {
        this.y = y;
    }

    // Phương thức tính khoảng cách giữa hai điểm
    public double distanceTo(Point2D p) {
        // Euclid
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    // Phương thức hiển thị tọa độ của điểm
    public void displayPoint() {
        System.out.println("Point: (" + this.x + ", " + this.y + ")");
    }

    public static void main(String[] args) {
        // Tạo hai điểm với tọa độ khác nhau
        Point2D point1 = new Point2D(3.0, 4.0);
        Point2D point2 = new Point2D(7.0, 1.0);

        // Hiển thị thông tin của các điểm
        System.out.println("Point 1:");
        point1.displayPoint();
        System.out.println("Point 2:");
        point2.displayPoint();

        // Tính và hiển thị khoảng cách giữa hai điểm
        double distance = point1.distanceTo(point2);
        System.out.println("Khoảng cách giữa Point 1 và Point 2: " + distance);

// Cập nhật tọa độ của Point 1 và hiển thị lại
        point1.setX(5.0);
        point1.setY(6.0);
        System.out.println("\nPoint 1 sau khi cập nhật:");
        point1.displayPoint();
    }
}
