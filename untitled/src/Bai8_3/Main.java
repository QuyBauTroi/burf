package Bai8_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thoi gian bat dau tran dau");
        String time = scanner.nextLine();
        System.out.println("Moi ban nhap thong tin team SKT:");
        ArrayList<SKT> sktTeam = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Moi ban nhap Champion thu"+ (i+1));
            String championName = scanner.nextLine();
            System.out.println("Moi ban nhap vi tri Champion thu "+ (i+1) + "dam nhiem :");
            String position = scanner.nextLine();
            SKT skt = new SKT(championName,position);
            sktTeam.add(skt);
        }
        System.out.println("Moi ban nhap thong tin team G2:");
        ArrayList<G2> g2Team = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Moi ban nhap Champion thu"+ (i+1));
            String championName = scanner.nextLine();
            System.out.println("Moi ban nhap vi tri Champion thu "+ (i+1) + "dam nhiem :");
            String position = scanner.nextLine();
            G2 g2 = new G2(championName, position);
            g2Team.add(g2);
        }


        System.out.println("Thoi gian tran dau cua team STK vs G2 :" +time);
        System.out.println("Team Skt :");
        System.out.println(sktTeam);
        System.out.println("Team G2 :");
        System.out.println(g2Team);
    }
}
