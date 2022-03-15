
public class InsufficientFundsException extends Exception {
    private double amountInsufficient;


    public InsufficientFundsException(double amountInsufficient){
        this.amountInsufficient = amountInsufficient;
    }

    public double getAmount(){
        return amountInsufficient;
    }
}
