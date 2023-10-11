package Bai6_3;

public class Main {

    public static void main(String[] args) {
        // Khai báo các hằng số tốc độ
        final double TỐC_ĐỘ_XE_BUS = 20;
        final double TỐC_ĐỘ_TÀU_HỎA = 40;
        final double TỐC_ĐỘ_MÁY_BAY = 80;

        // Tạo danh sách các phương tiện giao thông
        List<PhươngTiệnGiaoThông> phươngTiệnGiaoThông = new ArrayList<>();
        phươngTiệnGiaoThông.add(new XeBuýt("Xe buýt", 100));
        phươngTiệnGiaoThông.add(new TàuHỏa("Tàu hỏa", 200));
        phươngTiệnGiaoThông.add(new MáyBay("Máy bay", 500));

        // Yêu cầu người dùng nhập vào quãng đường
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào quãng đường cần di chuyển (km): ");
        double quãngĐường = scanner.nextDouble();

        // Tính thời gian đến nơi của từng phương tiện
        for (PhươngTiệnGiaoThông phươngTiện : phươngTiệnGiaoThông) {
            System.out.println("Thời gian đến nơi của phương tiện " + phươngTiện.getTên() + " là: " +
                    phươngTiện.tínhThờiGianĐếnNơi(quãngĐường) + " giờ");
        }
    }
}
