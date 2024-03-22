package capitulo03;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount) {
        if(depositAmount > 0.0) {
            balance = balance + depositAmount;
        } //No livro Deitel só tem esse IF, mas quando chegamos na questão 3.15 esse IF estruturado dessa forma, a questão saí errada
    }

    //Classe criada para a questão 3.11 do Deitel
    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            System.out.println("Value withdraw: " + value);
            System.out.println("Current balance: " + balance);
            return true;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
