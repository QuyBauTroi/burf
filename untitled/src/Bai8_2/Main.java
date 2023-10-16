package Bai8_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tiktok> tiktoks = new ArrayList<>();
        System.out.println("Nhap so idol:");
        int a = Integer.parseInt(scanner.nextLine());
        ArrayList<Idols> idols = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            System.out.println("Nhap Group Idol:");
            String group = scanner.nextLine();
            System.out.println("Nhap ten Idol thu "+(i+1));
            String name = scanner.nextLine();
            System.out.println("Nhap Id Idol thu "+(i+1));
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap email Idol thu "+(i+1));
            String email = scanner.nextLine();
            System.out.println("Nhap so luong followers:");
            int fl = Integer.parseInt(scanner.nextLine());
            ArrayList<Followers> followers = new ArrayList<>();
            for (int j = 0; j < fl; j++) {
                System.out.println("Nhap ten nguoi follow thu "+(i+1));
                String namee = scanner.nextLine();
                System.out.println("Nhap id nguoi follower thu"+(i+1));
                int idd = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap email nguoi follower thu "+(i+1));
                String emall = scanner.nextLine();
                System.out.println("Nhap Number of like");
                int numberOL = Integer.parseInt(scanner.nextLine());
                Followers followers1 = new Followers(namee,idd,emall,numberOL );
                followers.add(followers1);
            }
            Idols idols1 = new Idols( name,id,email,followers,group);
            idols1.setFollowers(followers);
            idols.add(idols1);

        }
        System.out.println("Nhap so bai hat:");
        int s = Integer.parseInt(scanner.nextLine());
        ArrayList<Songs> songs = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            System.out.println("Nhap song id thu "+(i+1));
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap ten bai hat thu "+(i+1));
            String name = scanner.nextLine();
            System.out.println("Nhap ten ca si:");
            String singer = scanner.nextLine();
            Songs songs1 = new Songs(id, name, singer);
            songs.add(songs1);
            Tiktok tiktok = new Tiktok(songs, idols);
            tiktok.setIdols(idols);
            tiktok.setSongs(songs);
            tiktoks.add(tiktok);
        }

        System.out.println(tiktoks);
    }
}
