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

        System.out.println("Registrerade konton: ");

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


}
