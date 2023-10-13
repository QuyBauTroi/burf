package BTVN7;

public  class bizStudent extends techMasterStudent{
    private double markettingScore;
    private double salesScore;

    public bizStudent(String name, String object, double markettingScore, double salesScore) {
        super(name, object);
        this.markettingScore = markettingScore;
        this.salesScore = salesScore;
    }

    @Override
    public double getScore() {
        return (2*markettingScore + salesScore)/3 ;
    }
}
