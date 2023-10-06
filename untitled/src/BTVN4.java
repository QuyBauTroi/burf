import java.util.Scanner;

public class BTVN4 {

    //Bai 1(do-while)
    public static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do{

            System.out.println("vui long nhap so nguyen:");
            n += Integer.parseInt(scanner.nextLine());

            System.out.println("Do you want to continue ? (Y/N)");
            answer = scanner.nextLine();
        }while (answer.equals("Y"));
        System.out.println("Tong so nguoi dung vua nhap la :"+n);
    }



    //Bai 1(while)
    public static void while_class(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap so nguyen-2:");
        n += Integer.parseInt(scanner.nextLine());
        System.out.println("Do you want to continue ? (Y/N)");
        String answer = scanner.nextLine();
        while (answer.equals("Y")){
            System.out.println("vui long nhap so nguyen:");
            n += Integer.parseInt(scanner.nextLine());
            System.out.println("Do you want to continue ? (Y/N)");
            answer = scanner.nextLine();

        }System.out.println("Tong so nguoi dung vua nhap la :"+n);

    }






    //bai 2
    public static void baiSTUDENT(){
        Scanner scanner = new Scanner(System.in);
        String name ="";
        String address ="";
        String awser ="";
        do{
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
        }while (awser.equals("Y"));{


        }
    }


}


