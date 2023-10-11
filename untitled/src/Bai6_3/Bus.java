class Bus extends Vehical {

    public XeBuýt(String tên, double tốcĐộ) {
        super(tên, tốcĐộ);
    }

    @Override
    public double tínhThờiGianĐếnNơi(double quãngĐường) {
        return quãngĐường / tốcĐộ;
    }
}