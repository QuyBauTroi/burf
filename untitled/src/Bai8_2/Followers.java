package Bai8_2;

public class Followers {
    private String namee;
    private int idd;
    private String emaill;
    private int numberOL;

    public Followers(String namee, int idd, String emaill, int numberOL) {
        this.namee = namee;
        this.idd = idd;
        this.emaill = emaill;
        this.numberOL = numberOL;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public void setNumberOL(int numberOL) {
        this.numberOL = numberOL;
    }

    @Override
    public String toString() {
        return "Followers{" +
                "namee='" + namee + '\'' +
                ", idd=" + idd +
                ", emaill='" + emaill + '\'' +
                ", numberOL=" + numberOL +
                '}';
    }
}
