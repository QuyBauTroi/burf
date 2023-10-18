package BaiLap3;

import BaiLap3.entities.Worker;
import BaiLap3.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        WorkerService workerService = new WorkerService();
        System.out.println(workerService.inputMenu(scanner,workers));
    }
}
