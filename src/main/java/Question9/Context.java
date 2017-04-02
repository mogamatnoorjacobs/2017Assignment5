package Question9;

/**
 * Created by fatimam on 02/04/2017.
 */
public class Context {

    private CalculateFees calculateFees;

    public Context(CalculateFees calculateFees){
        this.calculateFees = calculateFees;
    }

    public double calculating(double amount){
        return calculateFees.calculation(amount);
    }
}
