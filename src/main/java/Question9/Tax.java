package Question9;

/**
 * Created by fatimam on 02/04/2017.
 */
public class Tax  implements CalculateFees {


    public double calculation(double amount) {
        return amount + (amount*0.14);
    }
}
