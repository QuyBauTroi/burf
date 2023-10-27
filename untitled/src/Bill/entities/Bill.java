package Bill.entities;

import java.util.ArrayList;

public class Bill {
    private long oldNumber;
    private long newNumber;


    public Bill(long oldNumber, long newNumber) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }



    public long Price(){
        return (newNumber-oldNumber)*750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "oldNumber=" + oldNumber +
                ", newNumber=" + newNumber +
                '}';
    }
}
