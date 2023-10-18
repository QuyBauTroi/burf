package BaiLap3.service;

import BaiLap3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    ArrayList<Worker> workers = new ArrayList<>();
    public int inputMenu(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("1. Add a new worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                workers.add(inputWorker(scanner, workers));
                break;
            case 2:
                upSalary(scanner,workers);
                break;
            case 3:
                downSalary(scanner,workers);
                break;
            case 4:
                printInfo(workers);
                break;
            case 5:
                System.exit(0);
                break;
        }

        return inputMenu(scanner, workers);
    }

    public Worker inputWorker(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten cong nhan:");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi cong nhan:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap tien luong:");
        Double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chuc vu:");
        String workPlace = scanner.nextLine();
        return new Worker(id, name, age, salary, workPlace);
    }


    public void printInfo(ArrayList<Worker> workers) {
        System.out.println(workers);
    }

    public void upSalary(Scanner scanner, ArrayList<Worker> workers) {
        double luong_thuong;
        double tongLuong;
        System.out.println("tim kiem theo id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < this.workers.size(); i++) {
            if (id == this.workers.get(i).getId()) {
                System.out.println("Nhap luong thuong: ");
                luong_thuong = Double.parseDouble(scanner.nextLine());

                tongLuong = this.workers.get(i).getSalary() + luong_thuong;

                System.out.println("Luong nhan duoc la: " + tongLuong);
            }
        }
    }
    public void downSalary(Scanner scanner, ArrayList<Worker> workers) {
        double phat;
        double tongLuong;
        System.out.println("tim kiem theo id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < this.workers.size(); i++) {
            if (id == this.workers.get(i).getId()) {
                System.out.println("Nhap luong thuong: ");
                phat = Double.parseDouble(scanner.nextLine());

                tongLuong = this.workers.get(i).getSalary() - phat;

                System.out.println("Luong nhan duoc la: " + tongLuong);
            }
        }
    }
}




