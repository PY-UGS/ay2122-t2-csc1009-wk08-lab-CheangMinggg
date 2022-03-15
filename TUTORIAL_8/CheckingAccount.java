import java.util.Scanner;

public class CheckingAccount   {
    
    double balance;
    int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }


    public void deposit(double amount) throws Exception{
        if (amount >= 0){
            balance += amount;
        }
        else{
           throw new Exception("Amount deposit is negative"); 
        }
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance){
            balance -= amount;
        }
        else{
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public static void main(String[] args) {
        CheckingAccount ac = new CheckingAccount(2100965);
        
      
        try{
            System.out.println("Deposit: ");
            Scanner sc = new Scanner(System.in);
            double deposit = sc.nextDouble();

            ac.deposit(deposit);

            System.out.println("Withdraw: ");
            double withdrawn = sc.nextDouble();
            ac.withdraw(withdrawn);
            System.out.println("The balance after withdraw is: " + ac.getBalance());
        } catch(InsufficientFundsException e){
            System.out.println("Sorry, but you are short of $" + e.getAmount());
            e.printStackTrace();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
