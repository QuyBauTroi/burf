package Bai8_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ho dan:");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Hodan> house = new ArrayList<>();

        for (int q = 0; q < n; q++) {
            System.out.println("Moi ban nhap id ho dan thu " +(q+1));
            int idhoushold = Integer.parseInt(scanner.nextLine());
            System.out.println("Moi ban nhap address: ");
            String address = scanner.nextLine();
            System.out.println("Nhap so thanh vien trong gia dinh:");
            int a = Integer.parseInt(scanner.nextLine());
            ArrayList<Family> families = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                System.out.println("Moi ban nhap id thanh vien thu" + (i + 1));
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Moi ban nhap Ten thanh vien thu" + (i + 1));
                String name = scanner.nextLine();
                System.out.println("Moi ban nhap ngày tháng năm sinh của thành viên thứ" + (i + 1));
                String birth = scanner.nextLine();
                LocalDate dob = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.println("Moi ban nhap nghe nghiep cua thành vien thứ" + (i + 1));
                String job = scanner.nextLine();
                Family family = new Family(id, name, dob, job);
                families.add(family);
            }
            Hodan household = new Hodan(idhoushold,address,families);
            household.setFamilys(families);
            house.add(household);
        }
        System.out.println(house);
    }
}
