package Techmatter.service;

import Techmatter.Utils.Utils;
import Techmatter.entities.Book;
import Techmatter.entities.Reader;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReaderService implements IService<Reader>{
    Utils utils = new Utils();


    @Override
    public void ínsert(Scanner scanner, Map<Integer, Reader> readerMap) {
        Reader reader = new Reader();
        System.out.println("Nhap ho ten : ");
        reader.setName(utils.inputString(scanner));
        System.out.println("nhap SDT:");
        reader.setPhoneNumber(utils.inputInt(scanner));
        System.out.println("Nhap dia chi: ");
        reader.setAddress(utils.inputString(scanner));
        readerMap.put(reader.getId(),reader);
    }

    @Override
    public void update(Scanner scanner, Map<Integer, Reader> readerMap) {
        String choice = "";
        do {
            System.out.println("Nhap ten sach muon doi: ");
            String bookFind= utils.inputString(scanner);
            Set<Integer> set = readerMap.keySet();
            for (Integer key: set) {
                if (bookFind.equalsIgnoreCase(readerMap.get(key).getName())) {

                    System.out.println("Nhap ho ten : ");
                    readerMap.get(key).setName(utils.inputString(scanner));
                    System.out.println("nhap SDT:");
                    readerMap.get(key).setPhoneNumber(utils.inputInt(scanner));
                    System.out.println("Nhap dia chi: ");
                    readerMap.get(key).setAddress(utils.inputString(scanner));
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
    public void delete(Scanner scanner, Map<Integer, Reader> readerMap) {
            String choice = "";
            do {
                System.out.println("Nhap ten nguoi doc muon xoa: ");
                String bookFind= utils.inputString(scanner);
                Set<Integer> set = readerMap.keySet();
                for (Integer key: set) {
                    if (bookFind.equalsIgnoreCase(readerMap.get(key).getName())) {
                        readerMap.remove(key);
                        System.out.println("da xoa nguoi doc tim thay");
                    }
                    else {
                        System.out.println("khong tim thay lam lai ? y/n");
                        choice = utils.inputString(scanner);
                    }
                }
            }
            while (choice.equalsIgnoreCase("y"));
        }
    }

