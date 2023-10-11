// Lớp trừu tượng PhươngTiệnGiaoThông
abstract class Vehicle {

    private String tên;
    private double tốcĐộ;

    public Vehical(String tên, double tốcĐộ) {
        this.tên = tên;
        this.tốcĐộ = tốcĐộ;
    }

    public String getTên() {
        return tên;
    }

    public abstract double tínhThờiGianĐếnNơi(double quãngĐường);
}