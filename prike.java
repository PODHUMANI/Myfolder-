class BankAccount {
    private double balance; // தனிப்பட்ட (private) உறுப்பினர்

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() { // Getter method
        return balance;
    }

    public void deposit(double amount) { // Setter method
        if (amount > 0) {
            balance += amount;
        }
    }
}
