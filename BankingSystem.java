import java.util.Scanner;

public class BankingSystem {
    static double balance = 0.0;
    static int storedPin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Create your 4-digit PIN: ");
        storedPin = sc.nextInt();

        System.out.print("Login - Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != storedPin) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited: $" + deposit);
                    break;
                case 3:
                    System.out.print("Amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: $" + withdraw);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for banking with us.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
