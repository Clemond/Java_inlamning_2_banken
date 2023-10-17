public class Account {

    protected int accountNumber;
    protected int balance = 0;

//konstruktor
    public Account (int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getAccountBalance(){
        return this.balance;
    }


}
