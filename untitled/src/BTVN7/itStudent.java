package BTVN7;

public  class itStudent extends techMasterStudent{
    private double javaScore;
    private double htmlScore;
    private double cssScore;

    public itStudent(String name, String object, double javaScore, double htmlScore, double cssScore) {
        super(name, object);
        this.javaScore = javaScore;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
    }




    @Override
    public double getScore() {
        return (2*javaScore + htmlScore + cssScore)/4;
    }
}
