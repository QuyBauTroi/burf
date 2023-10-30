package Lap4.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketingStaff extends Staff{
    private double sales;
    private double percentBonus;

    public MarketingStaff(String name, double salary, double sales, double percentBonus) {
        super(name, salary);
        this.sales = sales;
        this.percentBonus = percentBonus;
    }


    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getPercentBonus() {
        return percentBonus;
    }

    public void setPercentBonus(double percentBonus) {
        this.percentBonus = percentBonus;
    }

    public double marketingSalary(){
        double marketingSalary = getSalary()+ (sales * percentBonus);
        if (marketingSalary>11000000){
            marketingSalary = marketingSalary - (marketingSalary*0.1);
        }
        return marketingSalary;
    }


    @Override
    public String toString() {
        return "MaketingStaff{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                "sales=" + sales +
                ", percentBonus=" + percentBonus +
                '}';
    }


}
