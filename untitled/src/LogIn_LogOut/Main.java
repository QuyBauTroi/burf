package LogIn_LogOut;

import LogIn_LogOut.entities.User;
import LogIn_LogOut.service.LogInOutService;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        LogInOutService logInOutService = new LogInOutService();
        logInOutService.inputMenu(scanner,users);
    }

}
