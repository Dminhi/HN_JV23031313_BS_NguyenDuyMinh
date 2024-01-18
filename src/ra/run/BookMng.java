package ra.run;

import ra.bussiness.Book;

import java.util.Arrays;
import java.util.Scanner;

public class BookMng {
    public static Book[] books = new Book[0];

    public void addNewBook(Scanner sc) {
        System.out.println("Nhập số lượng sách cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        // Taọ ra một mảng mới
        Book[] newBooks = new Book[books.length + n];
        // Dùng vòng lặp để copy giá trị cũ
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        for (int i = 0; i < n; i++) {
            Book newBook = new Book();
            newBook.inputData(sc);
            newBooks[books.length + i] = newBook;
        }
        books = newBooks;
    }

    public void showAllBook() {
        if (books.length == 0) {
            System.err.println("Danh sách sách rỗng");
        } else {
            System.out.println("Danh sách sách");
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i].displayData());
            }
        }
    }

    public void updateBook(Scanner sc) {
        System.out.println("Hãy nhập id sách cần sửa");
        int id = sc.nextInt();
        int indexById = findIndexById(id);
        if (indexById != -1) {
        // Cho nhập thông tin mới
            System.out.println("Thông tin sách cũ");
            System.out.println(books[indexById]);
          books[indexById].inputData(sc);
            System.out.println("Cập nhật thành công");
        } else {
            System.err.println("không tìm thấy id sách");
        }
    }

    public void findBookbyBookName(){
        System.out.println("Hãy nhập tên sách cần tìm");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if(books[i].getBookName().contains(bookName)){
                System.out.println("Sách được tìm thấy là : ");
                System.out.println(books[i].getBookName());
            }
            else {
                System.out.println("Không tìm thấy thấy sách");
            }
        }
    }

    public void sortInterest(){
    }


    public void deleteBook(Scanner sc) {
        System.out.println("Hãy nhập id sách cần xoá");
        int id = sc.nextInt();
        int indexById = findIndexById(id);
        if (indexById != -1) {
            Book[]newBook=new Book[books.length-1];
            for (int i = 0; i < books.length; i++) {
                if(i<indexById){
                    newBook[i]=books[i];
                }
                else if(i>indexById){
                    newBook[i-1]=books[i];
                }
            }
            books=newBook;
            System.out.println("Xoá thành công");
        } else {
            System.err.println("không tìm thấy id sách");
        }
    }



    public int findIndexById(int id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() == id) {
                return i;
            }
        }
        return -1;
    }
}
