import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String address = "";
        String awser = "";
        do {
            System.out.println("Vui long dien thong tin hoc sinh:");
            System.out.println("Nhap ten:");
            name = scanner.nextLine();
            System.out.println("Nhap dia chi:");
            address = scanner.nextLine();
            System.out.println("Nhap tuoi:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println(age);
            System.out.println("Do you want to continue ? (Y/N)");
            awser = scanner.nextLine();
        } while (awser.equals("Y")); {


        }
    }
}
