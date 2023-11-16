import java.util.Scanner;

class Account {
    protected String Acc_Holder_Name;
    protected String Acc_Holder_Contact_No;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder's Name: ");
        Acc_Holder_Name = scanner.nextLine();
        System.out.print("Enter Account Holder's Contact Number: ");
        Acc_Holder_Contact_No = scanner.nextLine();
    }
}

class SavingsAccount extends Account {
    private int S_Acc_No;
    private double Balance;

    public void acceptDetails() {
        super.acceptDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Savings Account Number: ");
        S_Acc_No = scanner.nextInt();
        System.out.print("Enter Account Balance: ");
        Balance = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Account Holder's Name: " + Acc_Holder_Name);
        System.out.println("Account Holder's Contact Number: " + Acc_Holder_Contact_No);
        System.out.println("Savings Account Number: " + S_Acc_No);
        System.out.println("Account Balance: " + Balance);
    }
}

class CurrentAccount extends Account {
    private int C_Acc_No;
    private double Balance;

    public void acceptDetails() {
        super.acceptDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Current Account Number: ");
        C_Acc_No = scanner.nextInt();
        System.out.print("Enter Account Balance: ");
        Balance = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Account Holder's Name: " + Acc_Holder_Name);
        System.out.println("Account Holder's Contact Number: " + Acc_Holder_Contact_No);
        System.out.println("Current Account Number: " + C_Acc_No);
        System.out.println("Account Balance: " + Balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of account holders: ");
        int n = scanner.nextInt();

        SavingsAccount[] savingsAccounts = new SavingsAccount[n];
        CurrentAccount[] currentAccounts = new CurrentAccount[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account Holder " + (i + 1));
            savingsAccounts[i] = new SavingsAccount();
            savingsAccounts[i].acceptDetails();

            currentAccounts[i] = new CurrentAccount();
            currentAccounts[i].acceptDetails();
        }

        System.out.println("\nAccount holders with balance less than 10000 for current and less than 5000 for saving:");
        for (int i = 0; i < n; i++) {
            if (savingsAccounts[i].Balance < 5000) {
                System.out.println("\nSavings Account Details:");
                savingsAccounts[i].displayDetails();
            }

            if (currentAccounts[i].Balance < 10000) {
                System.out.println("\nCurrent Account Details:");
                currentAccounts[i].displayDetails();
            }
        }
    }
}
