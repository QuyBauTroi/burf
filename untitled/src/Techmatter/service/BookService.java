package Techmatter.service;

import Techmatter.Utils.Utils;
import Techmatter.entities.Book;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookService implements IService<Book>{
    Utils utils = new Utils();

    @Override
    public void ínsert(Scanner scanner, Map<Integer,Book> bookMap) {
        Book book = new Book();
        System.out.println("Nhap ten sach: ");
        book.setBookName(utils.inputString(scanner));
        System.out.println("nhap tac gia:");
        book.setAuthor(utils.inputString(scanner));
        System.out.println("Nhap chu de: ");
        book.setCategory(utils.inputString(scanner));
        System.out.println("Nhap so luong: " );
        book.setQuantity(utils.inputInt(scanner));
        bookMap.put(book.getId(),book);

    }

    @Override
    public void update(Scanner scanner, Map<Integer,Book> bookMap) {
        String choice = "";
        do {
            System.out.println("Nhap ten sach muon doi: ");
            String bookFind= utils.inputString(scanner);
            Set<Integer> set = bookMap.keySet();
            for (Integer key: set) {
                if (bookFind.equalsIgnoreCase(bookMap.get(key).getBookName())) {

                    System.out.println("Nhap ten sach: ");
                    bookMap.get(key).setBookName(utils.inputString(scanner));
                    System.out.println("nhap tac gia:");
                    bookMap.get(key).setAuthor(utils.inputString(scanner));
                    System.out.println("Nhap chu de: ");
                    bookMap.get(key).setCategory(utils.inputString(scanner));
                    System.out.println("Nhap so luong: " );
                    bookMap.get(key).setQuantity(utils.inputInt(scanner));
                }
                else {
                    System.out.println("khong tim thay lam lai ? y/n");
                    choice = utils.inputString(scanner);
                }
            }
        }
        while (choice.equalsIgnoreCase("y"));
    }


    @Override
    public void delete(Scanner scanner, Map<Integer,Book> bookMap) {
            String choice = "";
            do {
                System.out.println("Nhap ten sach muon xoa: ");
                String bookFind= utils.inputString(scanner);
                Set<Integer> set = bookMap.keySet();
                for (Integer key: set) {
                    if (bookFind.equalsIgnoreCase(bookMap.get(key).getBookName())) {
                        bookMap.remove(key);
                        System.out.println("da xoa sach tim thay");
                    }
                    else {
                        System.out.println("khong tim thay lam lai ? y/n");
                        choice = utils.inputString(scanner);
                    }
                }
            }
            while (choice.equalsIgnoreCase("y"));
        }

    public Book findBookById(Map<Integer,Book> bookMap,Scanner scan) {
        while (true) {
            int id = utils.inputInt(scan);
            if (bookMap.containsKey(id)) {
                return bookMap.get(id);
            }
            else {
                System.out.println("Khong tm thay doi tuong nhap lai");
            }
        }
    }
}


