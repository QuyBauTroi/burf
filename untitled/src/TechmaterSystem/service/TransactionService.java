package TechmaterSystem.service;

import TechmaterSystem.entities.TransactionHistory;
import TechmaterSystem.entities.User;

import java.util.Map;

public class TransactionService{
    public void displayHistoryTransition(Map<Integer, User> userMap, Map<Integer, TransactionHistory> transitionHistories) {
        for (User user : userMap.values()) {
            if (transitionHistories.containsKey(user.getId())) {
                System.out.println("User: " + user.getName() + " has transaction history:");
                System.out.println(transitionHistories.get(user.getId()).toString());
            }
        }
    }
}
