public class Account {

    protected int accountNumber;
    protected int balance = 100;  //Alla konton som skapas får ett startkapital på 100kr.
                                  //ev. skriv ut det till användaren när man skapar ett konto.

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
