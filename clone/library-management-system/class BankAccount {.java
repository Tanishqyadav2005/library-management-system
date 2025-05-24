class BankAccount {
    private String name;           
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getDisplay() {
        System.out.println("Name: " + name);
        if (balance >= 0) {
            System.out.println("Balance = " + balance);
        } else {
            System.out.println("Invalid balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount s1 = new BankAccount();

        s1.setName("Rahul");           /
        s1.setBalance(5000);
        s1.setBalance(-20);            
        s1.getDisplay();
    }
}
