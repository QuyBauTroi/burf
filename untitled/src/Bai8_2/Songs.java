package Bai8_2;

public class Songs {
    private int id;
    private  String name;
    private String singer;

    public Songs(int id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
