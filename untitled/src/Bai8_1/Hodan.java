package Bai8_1;

import java.util.ArrayList;

public class Hodan {
    private int idhousehold;
    private String address;
    private ArrayList<Family> familys;

    public void setFamilys(ArrayList<Family> familys) {
        this.familys = familys;
    }

    public Hodan(int idhousehold, String address, ArrayList<Family> familys) {
        this.idhousehold = idhousehold;
        this.address = address;
        this.familys = familys;
    }

    @Override
    public String toString() {
        return "Hodan{" +
                "idhousehold=" + idhousehold +
                ", address='" + address + '\'' +
                ", familys=" + familys +
                '}';
    }
}
