package TechmaterSystem.entities;

public class Course {
    private int id;
    private static int autoId;
    private String name;
    private String timeLine;
    private String description;
    private double price;
    private String typeCourse;
    private int vote;

    public Course(String name, String timeLine, String description, double price, String typeCourse, int vote) {
        this.id = ++autoId;
        this.name = name;
        this.timeLine = timeLine;
        this.description = description;
        this.price = price;
        this.typeCourse = typeCourse;
        this.vote = vote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Course.autoId = autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeCourse() {
        return typeCourse;
    }

    public void setTypeCourse(String typeCourse) {
        this.typeCourse = typeCourse;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time_line=" + timeLine +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", type_course='" + typeCourse + '\'' +
                ", vote='" + vote + '\'' +
                '}';
    }

}
