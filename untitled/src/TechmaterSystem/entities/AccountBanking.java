package TechmaterSystem.entities;


    public class AccountBanking {
        private int id;
        private static int autoId;
        private String nameBank;
        private String accountNum;

        public AccountBanking(String nameBank, String accountNum) {
            this.id = ++autoId;
            this.nameBank = nameBank;
            this.accountNum = accountNum;
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
            AccountBanking.autoId = autoId;
        }

        public String getNameBank() {
            return nameBank;
        }

        public void setNameBank(String nameBank) {
            this.nameBank = nameBank;
        }

        public String getAccountNum() {
            return accountNum;
        }

        public void setAccountNum(String accountNum) {
            this.accountNum = accountNum;
        }

        @Override
        public String toString() {
            return "AccountBanking{" +
                    "id=" + id +
                    ", nameBank='" + nameBank + '\'' +
                    ", accountNum=" + accountNum +
                    '}';
        }
    }

