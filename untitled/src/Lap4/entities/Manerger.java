package Lap4.entities;

import Lap4.service.ManergerService;

public class Manerger extends Staff{
    private double bonusSalary;

    public Manerger(String name, double salary, double bonusSalary) {
        super(name, salary);
        this.bonusSalary = bonusSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double manergerSalary(){
        double manergerSalary = bonusSalary+getSalary();
        if (manergerSalary>11000000){
            manergerSalary = manergerSalary - (manergerSalary*0.1);
        }
        return manergerSalary;
    }

    @Override
    public String toString() {
        return "Manerger{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", bonusSalary=" + bonusSalary +
                '}';
    }
}
