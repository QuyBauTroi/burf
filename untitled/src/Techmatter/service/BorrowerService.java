package Techmatter.service;

import Techmatter.Utils.Utils;
import Techmatter.entities.Book;
import Techmatter.entities.Borrower;
import Techmatter.entities.Reader;

import java.util.Map;
import java.util.Scanner;

public class BorrowerService {
    BookService bookService = new BookService();
    ReaderService readerService = new ReaderService();
    Utils utils = new Utils();
    Book book = new Book();
    Borrower borrower = new Borrower();

    public void inputTicket(Scanner scanner, Map<Integer, Book>bookMap,Map<Integer, Reader> readerMap,Map<Integer, Borrower>borrowerMap){
        System.out.println("Nhap id sach muon muon :");
        bookService.findBookById(bookMap,scanner).getId();
        book.setQuantity(book.getQuantity()-1);
        if (book.getQuantity()==0){
            System.out.println("Khong con sach");
        }
        System.out.println("Nhap thong tin nguoi muon  :");
        readerService.ínsert(scanner, readerMap);
        System.out.println("Nhap ngay muon:");
        borrower.setBorrowDate(utils.inputString(scanner));
        System.out.println("Nhap ngay tra:");
        borrower.setReturnDate(utils.inputString(scanner));
        borrowerMap.put(borrower.getTicketId(),borrower);
        System.out.println("Thong ti nguoi muon sach :");
        System.out.println(" ID Sach :"+bookService.findBookById(bookMap,scanner).getId() + "Thong tin nguoi muon:"+readerMap + "Ngay muon:"+ borrower.getBorrowDate() + "Ngay tra: "+ borrower.getReturnDate());
    }
    public void returnBook(Scanner scanner, Map<Integer, Borrower>borrowerMap){
        System.out.println("Nhap id sach da muon:");
        int bookid = utils.inputInt(scanner);
        if (borrowerMap.containsKey(bookid)){
            borrowerMap.remove(bookid);
            System.out.println("Tra sach thanh cong");
        }else System.out.println("Khong tim thay id nao nhu vay");
    }
}
