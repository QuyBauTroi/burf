package BaitapBuoi14.service;

import BaitapBuoi14.Utils.Utils;
import BaitapBuoi14.enitities.Students;

import java.util.Map;
import java.util.Scanner;

public class StudentManagementService {
    Utils utils=new Utils();
    public  void inputStudentManagementService(Map<Integer, Students> studentsMap, Scanner scanner){
        int choose;
        do {
            System.out.println("Chon mot tuy chon:");
            System.out.println("1. Them 1 sinh vien vao danh sach:");
            System.out.println("2. Xoa 1 sinh vien khoi danh sach:");
            System.out.println("3. Tim kiem sinh vien dua tren ID:");
            System.out.println("4. Tinh diem trung binh cua cac hoc sinh trong danh sach :");
            System.out.println("5. In ra danh sach hoc sinh:");

            choose = utils.inputInt(scanner);
            switch (choose) {
                case 1:
                    addStudents(studentsMap,scanner);
                    break;
                case 2:
                    removeStudent(studentsMap,scanner);
                    break;
                case 3:
                    searchStudent(studentsMap,scanner);
                case 4:
                    getAverageScore(studentsMap);
                case 5:
                    printInfo(studentsMap);
                default:
                    System.out.println("Lua chon khong hop len , vui long nhap lai");
                    break;
            }
        }while (true);
    }



    public void addStudents(Map<Integer, Students> studentsMap, Scanner scanner){
        System.out.println("Nhap so hs muon them: ");
        int n= utils.inputInt(scanner);
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap ten:");
            String name = scanner.nextLine();
            System.out.println("Moi ban nhap diem so :");
            double score = utils.inputDouble(scanner);
            Students students = new Students(name,score);
            studentsMap.put(students.getId(),students);
        }

    }



    public void removeStudent(Map<Integer, Students> studentsMap, Scanner scanner){
        System.out.println("Mời bạn nhập id:");
        int id=Integer.parseInt(scanner.nextLine());
        if (!studentsMap.containsKey(id)){
            System.out.println("Khong co hoc sinh nao co Id nhu vay ca ??????");
            String choice = "";
            do {
                System.out.println("Do u want to continue(Y/N):");
                choice = scanner.nextLine();
            }while (choice.equalsIgnoreCase("y"));
        }else {
            System.out.println(studentsMap.remove(id));
            System.out.println("Da xoa thanh cong");
        }
    }




    public void searchStudent(Map<Integer, Students> studentsMap, Scanner scanner){
        System.out.println("Nhap id hoc sinh can tim:");
        int id = utils.inputInt(scanner);
        if (!studentsMap.containsKey(id)){
            System.out.println("Khong co hoc sinh nao co Id nhu vay ca ??????");
            String choice = "";
            do {
                System.out.println("Do u want to continue(Y/N):");
                choice = scanner.nextLine();
            }while (choice.equalsIgnoreCase("y"));
        }else {
            System.out.println(studentsMap.get(id));
            System.out.println("Tim kiem thanh cong");
        }
    }



    public void getAverageScore(Map<Integer, Students> studentsMap){
        double totalScore=0;
        for (Map.Entry<Integer,Students> entry:studentsMap.entrySet()){
            totalScore+=entry.getValue().getScore();
        }
        System.out.println("Điểm trung bình của các hs là: "+(totalScore/studentsMap.size()));
    }




    public void printInfo(Map<Integer, Students> studentsMap){
        System.out.println(studentsMap);
    }
}
