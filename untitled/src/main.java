import java.util.Scanner;

        public class main {

            public static void main(String[] args) {
                // Khai báo biến để lưu giá trị nhập vào
                String tenHangKho = "";
                String ngayThangNamSinh = "";
                String thoiGianNhapHang = "";

                // Hiển thị thông tin yêu cầu nhập liệu
                System.out.println("In thong tin hang hoa");
                System.out.println("Moi ban nhap ten hang kho:");
                tenHangKho = new Scanner(System.in).nextLine();
                System.out.println("Moi ban nhap ngay thang nam sinh (yyyy/MM/dd):");
                ngayThangNamSinh = new Scanner(System.in).nextLine();
                System.out.println("Moi ban nhap thoi gian nhap hang (HH:mm:ss):");
                thoiGianNhapHang = new Scanner(System.in).nextLine();

                // Hiển thị lại các giá trị đã nhập
                System.out.println("Ten hang kho: " + tenHangKho);
                System.out.println("Ngay thang nam sinh: " + ngayThangNamSinh);
                System.out.println("Thoi gian nhap hang: " + thoiGianNhapHang);
            }
        }

