package TechmaterSystem.entities;

import java.time.LocalDate;

public class TransactionHistory {
    private int id;
    private static int autoId;
    private LocalDate registrationDate;
    private String statusTransaction;

    public TransactionHistory(String statusTransaction) {
        this.id = ++autoId;
        this.registrationDate = LocalDate.now();
        this.statusTransaction = statusTransaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        TransactionHistory.autoId = autoId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getStatusTransaction() {
        return statusTransaction;
    }

    public void setStatusTransaction(String statusTransaction) {
        this.statusTransaction = statusTransaction;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "id=" + id +
                ", registrationDate=" + registrationDate +
                ", statusTransaction='" + statusTransaction + '\'' +
                '}';
    }
}
