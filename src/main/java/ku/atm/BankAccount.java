package ku.atm;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount {
   private double balance;
   private String accountType;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount() { balance = 0; }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }

   /**
    * Constructs a bank account with a given balance and account type.
    * @param initialBalance
    * @param accountType
    */
   public BankAccount(double initialBalance, String accountType) {
      balance = initialBalance;
      this.accountType = accountType;
   }
   /** 
      Deposits money into the account.
      @param amount the amount of money to withdraw
   */
   public void deposit(double amount) {
      balance = balance + amount;
   }

   /** 
      Withdraws money from the account.
      @param amount the amount of money to deposit
   */
   public void withdraw(double amount) throws NotEnoughBalanceException {
       if (amount > balance)
          if (this.accountType.equals("normal")) {
             throw new NotEnoughBalanceException("cannot withdraw more than balance");
          }
       balance = balance - amount;
   }

   public String getAccountType() {
      return accountType;
   }

   /** 
      Gets the account balance.
      @return the account balance
   */
   public double getBalance() {
      return balance; 
   }

}

