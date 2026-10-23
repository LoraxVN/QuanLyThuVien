import java.util.Scanner;

public class BTT2 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhắc người dùng nhập tên
        System.out.print("Nhập tên của bạn: ");
        
        // Đọc cả dòng văn bản (bao gồm cả khoảng trắng giữa họ và tên)
        String ten = scanner.nextLine();

        // In kết quả ra màn hình
        System.out.println("Xin chào, " + ten + "!");

        // Đóng scanner sau khi sử dụng
        scanner.close();
    }
}