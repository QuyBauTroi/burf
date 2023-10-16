package Bai8_2;

import java.util.ArrayList;

public class Idols {
    private String name;
    private int id;
    private String email;
    private ArrayList<Followers> followers;
    private String group;

    public Idols(String name, int id, String email, ArrayList<Followers> followers, String group) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFollowers(ArrayList<Followers> followers) {
        this.followers = followers;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", goup='" + group + '\'' +
                '}';
    }
}
