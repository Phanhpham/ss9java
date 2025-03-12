public class Fraction {
    // Thuộc tính của phân số
    private int numerator; // Tử số
    private int denominator; // Mẫu số

    // Constructor để khởi tạo phân số với tử số và mẫu số
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Phương thức cộng hai phân số
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức trừ hai phân số
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức nhân hai phân số
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức chia hai phân số
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Không thể chia cho phân số có tử số bằng 0");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Phương thức rút gọn phân số
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // Phương thức hiển thị phân số dưới dạng "tử số/mẫu số"
    public String toString() {
        simplify();
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        // Tạo đối tượng phân số và thực hiện các phép toán cộng, trừ, nhân, chia
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 5);

        // In kết quả phép cộng, trừ, nhân, chia
        System.out.println("Phân số 1: " + fraction1);
        System.out.println("Phân số 2: " + fraction2);

        // Cộng hai phân số
        Fraction sum = fraction1.add(fraction2);
        System.out.println("Tổng của hai phân số: " + sum);

        // Trừ hai phân số
        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("Hiệu của hai phân số: " + difference);

        // Nhân hai phân số
        Fraction product = fraction1.multiply(fraction2);
        System.out.println("Tích của hai phân số: " + product);

        // Chia hai phân số
        Fraction quotient = fraction1.divide(fraction2);
        System.out.println("Thương của hai phân số: " + quotient);
    }
}
