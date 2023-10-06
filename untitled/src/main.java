import java.util.Scanner;
public class main {
    public static Scanner scan = new Scanner(System.in);
    public static String choice;
    public static int n;
    public static void main(String[] args) {
        System.out.print("Nhap n = ");
        n = Integer.parseInt(scan.nextLine());
        System.out.println("Do you want to continue? (Y/N)");
        choice = scan.nextLine();
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Nhap n: ");
            n += Integer.parseInt(scan.nextLine());
            System.out.println("Do you want to continue? (Y/N)");
            choice = scan.nextLine();
        }
        System.out.println("Tong cac so n vua nhap = " + n);

    }

    public static void whileDo_Loop() {
        n=0;
        do {
            System.out.print("Nhap n lan 2 = ");
            n += Integer.parseInt(scan.nextLine());
            System.out.println("Do you want to continue? (Y/N)");
            choice = scan.nextLine();
        }while (choice.equalsIgnoreCase("y"));
        System.out.println("Tong cac so n vua nhap lan 2 = "+ n);
    }

    public static void studentInfo_Print() {
        do {
            System.out.print("Nhap ten: ");
            String name = scan.nextLine();
            System.out.print("Nhap dia chi: ");
            String address = scan.nextLine();
            System.out.print("Nhap tuoi: ");
            int age = Integer.parseInt(scan.nextLine());
            System.out.println("Ten hoc sinh: " + name + "\n Dia chi: " + address + "\nTuoi: " + age);
            System.out.println("Do you want to continue? (Y/N)");
            choice = scan.nextLine();
        }while (choice.equalsIgnoreCase("y"));
    }
}