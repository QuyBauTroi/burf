import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        String userName= "techmaster";
        String password = "hoclacoviec";
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap user name: ");
        String userNameInput = scan.nextLine();
        System.out.print("Nhap password: ");
        String passwordInput = scan.nextLine();
        if(userName.equals(userNameInput) && password.equals(passwordInput) ) {
            System.out.print("dang nhap thanh cong");
        }
        else {
            System.out.println("dang nhap khong thanh cong");
        }
    }
}