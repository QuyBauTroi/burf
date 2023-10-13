package Bai7_1;

import BTVN7.techMasterStudent;

public  class biZStudent extends techMasterStudent {
    private double markettingScore;
    private double salesScore;

    public biZStudent(String name, String object, double markettingScore, double salesScore) {
        super(name, object);
        this.markettingScore = markettingScore;
        this.salesScore = salesScore;
    }

    @Override
    public double getScore() {
        return (2*markettingScore + salesScore)/3 ;
    }
}
