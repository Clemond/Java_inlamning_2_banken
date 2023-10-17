import java.util.Scanner;

public class AccountMenu {

    Scanner myScanner = new Scanner(System.in);
    boolean menyOn = true;
    Register registerOfAccounts = new Register();


    public void accountMenu(){

        System.out.println("Ange kontonummer: ");
        Integer userInputAccountNumber = myScanner.nextInt();

        while(menyOn){
            System.out.println("**** KONTOMENY ****");
            System.out.println("1. Ta ut pengar");
            System.out.println("2. Sätt in pengar");
            System.out.println("3. Visa saldo");
            System.out.println("4. Avsluta");
            System.out.print("Ange menyval: ");
            Integer userChoice = myScanner.nextInt();

            switch(userChoice){
                case 3:
                registerOfAccounts.showBalance(userInputAccountNumber);
                 break;

                case 4:
                System.out.println("Tillbaka till huvudmenyn!");
                menyOn = false;
                 break;
            }


        }


    }
    
}
