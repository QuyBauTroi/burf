package TechmaterSystem.service;

import TechmaterSystem.entities.AccountBanking;
import TechmaterSystem.entities.Role;
import TechmaterSystem.entities.User;

import java.util.Map;

public class UsersService {
    public void display(User user, Map<Integer, AccountBanking> accountBankingList, Map<Integer, Role> roleMap) {
        Role userRole = findRoleById(user.getRoleId(), roleMap);
        AccountBanking userAccount = findAccountBankingById(user.getBankId(), accountBankingList);

        System.out.println("User{" +
                "id=" + user.getId() +
                ", name='" + user.getName() + '\'' +
                ", email='" + user.getEmail() + '\'' +
                ", phone='" + user.getPhone() + '\'' +
                ", roleId=" + (userRole != null ? userRole.getId() : "N/A") +
                ", bankId=" + (userAccount != null ? userAccount.getId() : "N/A") +
                '}');
    }

    public void findOnlineUsers(Map<Integer, User> userList, Map<Integer, AccountBanking> accountBankingList, Map<Integer, Role> roleList) {
        int count = 0;
        for (User user : userList.values()) {
            if (user.getRoleId() == 1) {
                display(user, accountBankingList, roleList);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy người dùng học online");
        }
    }

    public AccountBanking findAccountBankingById(int id, Map<Integer, AccountBanking> accountBankingList) {
        return accountBankingList.getOrDefault(id, null);
    }

    public Role findRoleById(int id, Map<Integer, Role> roleList) {
        return roleList.getOrDefault(id, null);
    }
}
