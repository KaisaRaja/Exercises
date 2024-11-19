package weekThree.ATM;

public class User {
    private String name;
    private int PIN;
    private Account account;

    public User(String name, int pin, Account account) {
        this.name = name;
        this.PIN = pin;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getPIN() {
        return PIN;
    }

    public Account getAccount() {
        return account;
    }
}