package TechmaterSystem;

import DoAnJava.service.UserService;
import TechmaterSystem.entities.*;
import TechmaterSystem.service.UsersService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, TransactionHistory> transitionHistoryMap = new HashMap<>();
        Map<Integer, AccountBanking> accountBankingMap = new HashMap<>();
        Map<Integer, Role> roleMap = new HashMap<>();
        User user1 = new User("Ng A","gmail","0123456789",1,1);
        User user2 = new User("Ng B","email","0123456789",2,2);
        Map<Integer,User> usersMap =new HashMap<>();
        usersMap.put(user1.getId(),user1);
        usersMap.put(user2.getId(),user2);
        OpeningScheduled openningScheduel = new OpeningScheduled();
        UsersService usersService = new UsersService();
        usersService.display((User) usersMap,accountBankingMap,roleMap);
    }

}
