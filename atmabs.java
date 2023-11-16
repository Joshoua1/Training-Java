import java.util.Scanner;

abstract class ATM {
     int balance;

    public ATM() {
        this.balance = 0;
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }
}

public class atmabs extends ATM {
    public static void main(String[] args) {
        ATM atm = new atmabs();
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************** Welcome to the ATM! ************************************");

        int choice = -1;

        while (choice != 0) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            if (choice == 1) {
                atm.checkBalance();
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = scanner.nextInt();
                atm.withdraw(withdrawAmount);
            } else if (choice == 3) {
                System.out.print("Enter amount to deposit: ");
                int depositAmount = scanner.nextInt();
                atm.deposit(depositAmount);
            } else if (choice == 0) {
                System.out.println("****************** Thank you for using the ATM! *********************");
            } else {
                System.out.println("xxxxxxxxxxxxxxxxxx Invalid choice. Please try again. xxxxxxxxxxxxxxxxxxxx");
            }
        }
    }
}