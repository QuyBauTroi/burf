package Bai8_3;

import java.util.ArrayList;

public class SummonRift {
    private ArrayList<SKT> skt;
    private ArrayList<G2> g2;

    public SummonRift(ArrayList<SKT> skt, ArrayList<G2> g2) {
        this.skt = skt;
        this.g2 = g2;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "skt=" + skt +
                ", g2=" + g2 +
                '}';
    }
}
