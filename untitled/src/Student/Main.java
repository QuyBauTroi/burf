package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu" + (i+1));
            System.out.println("Nhap hoc ten hoc sinh :");
            String name = scanner.nextLine();
            System.out.println("Nhap tuoi:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap diem:");
            double marks = Double.parseDouble(scanner.nextLine());
            Student student = new Student(name,age,marks);
            student.classify();
            student.display();

        }



    }
}
