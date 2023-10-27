package Bill.entities;

import Bill.service.BillService;

public class Customer {
    private String name;
    private String address;
    private String meterCode;

    public Customer(String name, String address, String meterCode, BillService billService) {
        this.name = name;
        this.address = address;
        this.meterCode = meterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", meterCode='" + meterCode + '\'' +
                '}';
    }
}
