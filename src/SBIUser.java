import java.util.UUID;

public class SBIUser implements BankInterface {

    private String name;
    private String accountNo;
    private String password;
    private double balance;
    private double interestRate;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.interestRate=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public String addMoney(int amount) {
        balance+=amount;
        return "Money added successfully and your balance is "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(password.equals(enteredPassword)){
            if(amount<=balance){
                balance-=amount;
                return "Money withdrawn successfully and available balance is "+balance;
            }
            else{
                return "Balance is not sufficient";
            }
        }
        return "Entered password is wrong";
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*interestRate*years)/100;
    }
}
