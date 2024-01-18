package ra.run;

import ra.bussiness.Book;

import java.util.Scanner;

public class BookManagement {
    public static BookMng bookMng = new BookMng();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách ");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            System.out.println("Enter your choice");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:// Nhập số lượng sách thêm mới và thông tin cho từng cuốn sách
                    bookMng.addNewBook(sc);
                    break;
                case 2: // Hiển thị thông tin sách
                    bookMng.showAllBook();
                    break;
                case 3: // Sắp xếp sách theo lợi nhuận tăng dần

                    break;
                case 4: // Xoá sách theo mã sách
                    bookMng.deleteBook(sc);
                    break;
                case 5: // Tìm kiếm tương đối sách theo miêu tả
                    bookMng.findBookbyBookName();
                    break;
                case 6:// Thay đổi thông tin sách theo mã sách
                    bookMng.updateBook(sc);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter your choice");
            }
        }
    }
}
