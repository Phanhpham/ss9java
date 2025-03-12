public class BankAccount {
    // Thuộc tính của tài khoản ngân hàng
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Phương thức nạp tiền vào tài khoản
    public void deposit(double amount) {
        if (amount > 0) {
            // Nếu số tiền nạp hợp lệ, tăng số dư tài khoản
            balance += amount;
            System.out.println("Số tiền đã nạp vào tài khoản: " + amount);
        } else {
            System.out.println("Số tiền nạp không hợp lệ.");
        }
    }

    // Phương thức rút tiền từ tài khoản
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            // Nếu số tiền rút hợp lệ, giảm số dư tài khoản
            balance -= amount;
            System.out.println("Số tiền đã rút khỏi tài khoản: " + amount);
        } else {
            System.out.println("Số dư không đủ hoặc số tiền rút không hợp lệ.");
        }
    }

    // Phương thức chuyển tiền giữa hai tài khoản
    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            // Chuyển tiền từ tài khoản này sang tài khoản khác
            recipient.deposit(amount);
            System.out.println("Số tiền đã chuyển: " + amount);
        } else {
            System.out.println("Số dư không đủ hoặc số tiền chuyển không hợp lệ.");
        }
    }

    // Phương thức hiển thị thông tin tài khoản
    public void display() {
        System.out.println("Tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolder);
        System.out.println("Số dư tài khoản hiện tại: " + balance);
    }

    public static void main(String[] args) {
        // Tạo đối tượng tài khoản với số tài khoản, tên chủ tài khoản và số dư
        BankAccount account1 = new BankAccount("12345", "Nguyen A", 1000);
        BankAccount account2 = new BankAccount("67890", "Tran B", 500);

        // Hiển thị thông tin tài khoản
        System.out.println("Thông tin tài khoản 1:");
        account1.display();
        System.out.println("Thông tin tài khoản 2:");
        account2.display();

        // Thực hiện giao dịch nạp tiền, rút tiền và chuyển tiền
        // nap
        account1.deposit(500);
        // rút
        account1.withdraw(200);
        // Chuyển tiền từ tài khoản 1 sang tài khoản 2

        account1.transfer(account2, 300);

        // Hiển thị lại thông tin tài khoản sau giao dịch
        System.out.println("\nThông tin tài khoản 1 sau giao dịch:");
        account1.display();
        System.out.println("Thông tin tài khoản 2 sau giao dịch:");
        account2.display();
    }
}
