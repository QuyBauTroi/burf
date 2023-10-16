package Bai8_2;

import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Songs> songs;
    private ArrayList<Idols> idols;


    public void setSongs(ArrayList<Songs> songs) {
        this.songs = songs;
    }

    public void setIdols(ArrayList<Idols> idols) {
        this.idols = idols;
    }

    public Tiktok(ArrayList<Songs> songs, ArrayList<Idols> idols) {
        this.songs = songs;
        this.idols = idols;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "songs=" + songs +
                ", idols=" + idols +
                '}';
    }
}
