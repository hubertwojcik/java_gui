package T01.T01_Bank;

public class Account {
    private double balance;
    public static double interest;
    Account(){
        balance=0;
    }

    public void deposit(double value){
        if(value<=0){
            throw new IllegalArgumentException("Deposit value has to be bigger than 0");
        }
        balance+=value;
    }

    public void withdraw(double value){
        if (value<=0){
            throw new IllegalArgumentException("Withdraw value has to be bigger than 0");
        }
        if(value>balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance-=value;
    }

    public void transfer(Account account,double value){
        if (value > balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance-=value;
        account.deposit(value);
    }

    public double getBalance(){
        return this.balance;
    }

    public static void setInterestRate(double value){
        interest=value;
    }

    public void addInterest(){
        double newValue = balance + (balance*interest/100);
        balance=newValue;
    }
}
