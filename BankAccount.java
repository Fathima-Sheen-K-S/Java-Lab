import java.util.Scanner;
 class BankAccount {
     String accountNumber;
     String accountHolder;
     double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the account number:");
        String actnum = scanner.nextLine();
        System.out.println("Enter the account name:");
        String acthold = scanner.nextLine();
        System.out.println("Enter the balance:");
        double bal = scanner.nextDouble();
        System.out.println("Enter the amount:");
        int amt=scanner.nextInt();
        
        BankAccount account = new BankAccount(actnum,acthold,bal);
        
        account.displayAccountInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayAccountInfo();
    }
}
 
