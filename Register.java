import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    
    Scanner myScanner = new Scanner(System.in);
    ArrayList <Account> listOfAccounts = new ArrayList<>();

    public void addAccount(){ 
        boolean registerUserNumber = true;
        System.out.print("\n" + "Skriv in kontonummer: ");
        int userInputAccountNumber = myScanner.nextInt();


        if(listOfAccounts.size() == 0){
            listOfAccounts.add(new Account(userInputAccountNumber));
            System.out.println("Nytt konto registrerat. (från första if:en)"+ "\n");
            registerUserNumber = false;
        }
        else {  
            for(int i = 0; i < listOfAccounts.size(); i++){
                if(userInputAccountNumber == listOfAccounts.get(i).getAccountNumber()){
                    System.out.println("kontot finns redan registrerat!"+ "\n");
                    registerUserNumber = false;
                }
            }
        }
        while(registerUserNumber){
            listOfAccounts.add(new Account(userInputAccountNumber));
            System.out.println("Nytt konto registrerat!"+ "\n");
            break;
        }
    }

//---------------------------------------------------------------//


    public void printAllAccounts(){

        System.out.println("\n" + "Registrerade konton: ");

        for (int i = 0; i < listOfAccounts.size(); i++){
            System.out.println(listOfAccounts.get(i).getAccountNumber());
        }
    }

//---------------------------------------------------------------//

    public void showBalance(int accountNumber){

        for(int i = 0; i < listOfAccounts.size(); i++){
            if (accountNumber == listOfAccounts.get(i).getAccountNumber()){
                System.out.println("Nuvarande saldo är: " + listOfAccounts.get(i).getAccountBalance());
            }
            else{
                System.out.println("Kontot hittades inte!");
            }
        }
    }

//---------------------------------------------------------------//

    public void accountMenu(){
        boolean menyOn = true;
        boolean accountNotValid = true;
        int activeAccountIndex = 0;

        System.out.print("\n" + "Skriv in ditt kontonummer: ");
        int userInputAccountNumber = myScanner.nextInt();

        for(int i = 0; i < listOfAccounts.size(); i++){
            if(userInputAccountNumber == listOfAccounts.get(i).accountNumber){
                activeAccountIndex = i;
                System.out.println("\n" + "Kontot finns registrerat på indexplats: " + activeAccountIndex);
                System.out.println("Välkommen!" + "\n");
                accountNotValid = false;
            }
        }
        if(accountNotValid == true){
            System.out.println("Kontot finns inte registrerat!");
            menyOn = false;
        }

        while(menyOn){

            System.out.println("\n" + "**** KONTOMENY ****");
            System.out.println("1. Ta ut pengar");
            System.out.println("2. Sätt in pengar");
            System.out.println("3. Visa saldo");
            System.out.println("4. Avsluta");
            System.out.print("Ange menyval: ");

            int userChoice = myScanner.nextInt();

            switch(userChoice){
                case 2:
                    System.out.print("\n" +  "Hur mycket vill du sätta in på ditt konto?");
                    int userDeposit = myScanner.nextInt();
                    listOfAccounts.get(activeAccountIndex).deposit(userDeposit);
                    System.out.println("Ditt nya saldo är: " + listOfAccounts.get(activeAccountIndex).getAccountBalance());
                 break; 
                case 3: 
                    System.out.println("\n" +  "Saldo: " + listOfAccounts.get(activeAccountIndex).getAccountBalance() + "kr" + "\n");
                 break;
                case 4: 
                    System.out.println("\n" + "Tillbaka till huvudmenyn...");
                    menyOn = false;
                 break;
            }

        }
    }




//---------------------------------------------------------------//

}
