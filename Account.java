public class Account {

    protected int accountNumber;
    protected double balance = 0; 

//konstruktor
    public Account (int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getAccountBalance(){
        return this.balance;
    }
    public double deposit(double userDeposit){
        balance = balance + userDeposit;
        return this.balance;
    }
    public double withdraw(double userWithdrawl){
        balance = balance - userWithdrawl;
        return this.balance;
    }


}
