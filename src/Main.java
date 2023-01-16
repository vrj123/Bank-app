import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your details to create account");

        //Create account
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Set your password");
        String password=sc.next();
        System.out.println("Enter initial amount you want to add your account");
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name, password, balance);

        //Add money
        System.out.println("Enter amount to add");
        int amount=sc.nextInt();
        String message=user.addMoney(amount);
        System.out.println(message);

        //Withdraw Money
        System.out.println("Enter amount that you want to withdraw");
        amount=sc.nextInt();
        System.out.println("Enter your password");
        password=sc.next();
        message= user.withdrawMoney(amount, password);
        System.out.println(message);
        System.out.println("Here is change");
    }



}