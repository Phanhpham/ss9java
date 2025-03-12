import java.util.ArrayList;
import java.util.Scanner;

public enum Gender {
    MALE, FEMALE, OTHER
}

class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    // Constructor không có tham số
    public Student() {}

    // Phương thức inputData để nhập thông tin học sinh
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học sinh: ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên học sinh: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập tuổi học sinh: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Nhập giới tính (MALE, FEMALE, OTHER): ");
        String genderInput = scanner.nextLine().toUpperCase();
        this.gender = Gender.valueOf(genderInput);

        System.out.print("Nhập địa chỉ học sinh: ");
        this.address = scanner.nextLine();

        System.out.print("Nhập số điện thoại học sinh: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Phương thức displayData để hiển thị thông tin học sinh
    public void displayData() {
        System.out.println("Mã học sinh: " + this.id);
        System.out.println("Tên học sinh: " + this.name);
        System.out.println("Tuổi học sinh: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phoneNumber);
    }
}

class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Hiển thị danh sách tất cả sinh viên
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Không có sinh viên nào.");
        } else {
            for (Student student : students) {
                student.displayData();
                System.out.println("--------------");
            }
        }
    }

    // Thêm mới sinh viên
    public void addStudent() {
        Student student = new Student();
        student.inputData();
        students.add(student);
        System.out.println("Thêm sinh viên thành công.");
    }

    // Sửa thông tin sinh viên
    public void updateStudent(int id) {
        for (Student student : students) {
            if (student.id == id) {
                student.inputData();
                System.out.println("Cập nhật thông tin thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã học sinh: " + id);
    }

    // Xóa sinh viên
    public void removeStudent(int id) {
        students.removeIf(student -> student.id == id);
        System.out.println("Xóa sinh viên thành công.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    studentManager.displayAllStudents();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    int updateId = scanner.nextInt();
                    studentManager.updateStudent(updateId);
                    break;
                case 4:
                    System.out.print("Nhập mã học sinh cần xóa: ");
                    int removeId = scanner.nextInt();
                    studentManager.removeStudent(removeId);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        }

        scanner.close();
    }
}
