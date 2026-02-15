import java.util.Scanner;
class Account {
    private int accountNumber;
    private String holderName;
    private int balance;

    Account(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    String getHolderName() {
        return holderName;
    }

    int getBalance() {
        return balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
class Bank {

    Account a1 = new Account(1102, "suresh", 2700);
    Account a2 = new Account(1103, "ramu", 2300);
    Account a3 = new Account(1104, "simha", 5600);
    Account a4 = new Account(1105, "rani", 6755);
    Account a5 = new Account(1106, "veera", 2300);

    Account findAccount(int accNo) {
        if (a1.getAccountNumber() == accNo) return a1;
        if (a2.getAccountNumber() == accNo) return a2;
        if (a3.getAccountNumber() == accNo) return a3;
        if (a4.getAccountNumber() == accNo) return a4;
        if (a5.getAccountNumber() == accNo) return a5;
        return null;
    }
}
class BankService {

    private Bank bank = new Bank();

    void showDetails(int accNo) {
        Account acc = bank.findAccount(accNo);
        if (acc != null) {
            System.out.println("Account Number : " + acc.getAccountNumber());
            System.out.println("Holder Name    : " + acc.getHolderName());
            System.out.println("Balance        : Rs." + acc.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    void checkBalance(int accNo) {
        Account acc = bank.findAccount(accNo);
        if (acc != null) {
            System.out.println("Current Balance: Rs." + acc.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    void deposit(int accNo, int amount) {
        Account acc = bank.findAccount(accNo);
        if (acc != null && amount > 0) {
            acc.deposit(amount);
            System.out.println("Updated Balance: Rs." + acc.getBalance());
        } else {
            System.out.println("Invalid deposit");
        }
    }

    void withdraw(int accNo, int amount) {
        Account acc = bank.findAccount(accNo);
        if (acc != null) {
            if (acc.withdraw(amount)) {
                System.out.println("Withdrawal successful");
                System.out.println("Remaining Balance: Rs." + acc.getBalance());
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Account not found");
        }
    }
}

public class Banking2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {
            System.out.println("\n--- ECO BANK ---");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int option = sc.nextInt();

            if (option == 5) {
                System.out.println("Thank you. Visit again.");
                break;
            }

            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();

            switch (option) {
                case 1 -> service.showDetails(accNo);
                case 2 -> service.checkBalance(accNo);
                case 3 -> {
                    System.out.print("Enter deposit amount: ");
                    service.deposit(accNo, sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Enter withdrawal amount: ");
                    service.withdraw(accNo, sc.nextInt());
                }
                default -> System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
