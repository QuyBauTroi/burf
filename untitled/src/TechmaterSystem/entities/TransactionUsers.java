package TechmaterSystem.entities;

public class TransactionUsers {
    private int id;
    private static int autoId;
    private int transactionHistoryId;
    private  int usersId;
    private int courseId;
    private int openingScheduleId;

    public TransactionUsers(int transactionHistoryId, int usersId, int courseId, int openingScheduleId) {
        this.id = ++autoId;
        this.transactionHistoryId = transactionHistoryId;
        this.usersId = usersId;
        this.courseId = courseId;
        this.openingScheduleId = openingScheduleId;
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
        TransactionUsers.autoId = autoId;
    }

    public int getTransactionHistoryId() {
        return transactionHistoryId;
    }

    public void setTransactionHistoryId(int transactionHistoryId) {
        this.transactionHistoryId = transactionHistoryId;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getOpeningScheduleId() {
        return openingScheduleId;
    }

    public void setOpeningScheduleId(int openingScheduleId) {
        this.openingScheduleId = openingScheduleId;
    }

    @Override
    public String toString() {
        return "TransactionUsersCourseOS{" +
                "id=" + id +
                ", transactionHistoryId=" + transactionHistoryId +
                ", usersId=" + usersId +
                ", courseId=" + courseId +
                ", openingScheduleId=" + openingScheduleId +
                '}';
    }
}
