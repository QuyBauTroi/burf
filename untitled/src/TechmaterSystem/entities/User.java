package TechmaterSystem.entities;

public class User {
    private int id;
    private static int autoId;
    private String name;
    private String email;
    private String phone;
    private int roleId;
    private int bankId;

    public User() {
        this.id = autoId++;
    }

    public User( String name, String email, String phone, int roleId, int bankId) {
        this.id = ++autoId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
        this.bankId = bankId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getRoleId() {
        return roleId;
    }

    public int getBankId() {
        return bankId;
    }

}
