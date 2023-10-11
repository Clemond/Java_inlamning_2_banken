import java.util.Scanner;

public class Bank {

    Scanner myScanner = new Scanner(System.in);
    boolean menyOn = true;

        public void mainMenu(){


            while(menyOn){
                System.out.println("Välkomna till menyn!");
                System.out.println("Vänligen gör ett av följande val: ");
                System.out.println("1. Skapa ett konto");
                System.out.println("2. Administrera konto");
                System.out.println("3. Avsluta");
                int userChoice = myScanner.nextInt();
                switch(userChoice){
                case 1:
                
                case 3:
                System.out.println("Programmet avslutas...");
                menyOn = false;
                break;
                }
            }
        }
  
    
}
