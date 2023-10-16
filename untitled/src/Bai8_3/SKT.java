package Bai8_3;

public class SKT {
    private String championName;
    private String position;

    public SKT(String championName, String position) {
        this.championName = championName;
        this.position = position;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "championName='" + championName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
