public class QuadraticEquation {
    // Thuộc tính của phương trình bậc 2
    double a;
    double b;
    double c;

    // Constructor để khởi tạo giá trị của a, b, c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        // delta = b^2 - 4ac
        return b * b - 4 * a * c;
    }

    // Phương thức kiểm tra phương trình có nghiệm thực hay không
    public boolean hasRealRoots() {
        // Kiểm tra delta >= 0
        return getDiscriminant() >= 0;
    }

    // Phương thức tính nghiệm thứ nhất
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            // Công thức tính nghiệm thứ nhất
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        // Nếu delta < 0, trả về NaN
        return Double.NaN;
    }

    // Phương thức tính nghiệm thứ hai
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return Double.NaN;
    }

    // Phương thức hiển thị nghiệm của phương trình
    public void display() {
        if (hasRealRoots()) {
            System.out.println("Nghiệm 1: " + getRoot1());
            System.out.println("Nghiệm 2: " + getRoot2());
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng QuadraticEquation với a, b, c
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);

        // Hiển thị nghiệm của phương trình
        equation.display();
    }
}
