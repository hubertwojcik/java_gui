package T01.T01_Bank;

public class BankCustomer {
    private Person person;
    private Account account;

    BankCustomer(Person person){
        this.person=person;
        this.account = new Account();
    }

    public Account getAccount(){
        return this.account;
    }

    @Override
    public String toString() {
        return "Klient: " + person.toString()+" stan konta " + account.getBalance();
    }
}
