package Bai8_3;

public class G2 {
    private String championName;
    private String position;

    public G2(String championName, String position) {
        this.championName = championName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "G2{" +
                "championName='" + championName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
