package BaitapBuoi14.enitities;

public class Students {
    private static int autoId;
    private int id;
    private String name;
    private double score;

    public Students( String name, double score) {
        this.id = ++autoId;
        this.name = name;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
