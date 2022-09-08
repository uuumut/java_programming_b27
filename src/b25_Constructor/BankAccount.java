package b25_Constructor;

public class BankAccount {

    public String accountHolder;
    public  long accountNumber;
    public  double balance;

    public void setInfo(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance="+" $" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println("your available balance is"+balance);
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Deposit amount can not be zero or negative");
            return;//exits the method right away
        }
        balance +=amount;
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient balance ");
            return;
        }
        balance -=amount;
    }

}
