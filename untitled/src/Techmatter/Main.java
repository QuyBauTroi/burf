package Techmatter;

import Techmatter.entities.Book;
import Techmatter.entities.Borrower;
import Techmatter.entities.Reader;
import Techmatter.service.BookService;
import Techmatter.service.BorrowerService;
import Techmatter.service.ReaderService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Book> bookMap = new HashMap<>();
        Map<Integer, Reader> readerMap = new HashMap<>();
        Map<Integer, Borrower>borrowerMap = new HashMap<>();
        BookService bookService = new BookService();
        ReaderService readerService = new ReaderService();
        BorrowerService borrowerService = new BorrowerService();
        bookService.ínsert(scanner,bookMap);
        bookService.update(scanner,bookMap);
        bookService.delete(scanner,bookMap);
        readerService.ínsert(scanner,readerMap);
        readerService.update(scanner,readerMap);
        readerService.delete(scanner,readerMap);
        borrowerService.inputTicket(scanner,bookMap,readerMap,borrowerMap);
        borrowerService.returnBook(scanner,borrowerMap);
    }
}
