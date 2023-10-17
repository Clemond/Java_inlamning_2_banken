import java.util.Scanner;

public class Bank {

    Scanner myScanner = new Scanner(System.in);
    boolean menyOn = true;
    Register registerOfAccounts = new Register();
    AccountMenu accountMenu = new AccountMenu();


        public void mainMenu(){

            while(menyOn){
                System.out.println("**** HUVUDMENY ****");
                System.out.println("1. Skapa ett konto");
                System.out.println("2. Administrera konto");
                System.out.println("3. Avsluta");
                System.out.println("4. TEST se alla registrerade konton!");
                System.out.print("Ange menyval: ");

                int userChoice = myScanner.nextInt();

                switch(userChoice){

                    case 1:
                        registerOfAccounts.addAccount();
                     break;
                    case 2:
                        accountMenu.accountMenu();
                     break;
                    case 3:
                        System.out.println("Programmet avslutas...");
                        menyOn = false;
                     break;
                    case 4:
                        registerOfAccounts.printAllAccounts();
                     break;

                }
            }
            
        }
        


       
  
    
}
