package Question4;

/**
 * Created by fatimam on 01/04/2017.
 */
public class CurrencyClass implements Currency {

    CurrencyAdapter currencyAdapter;
    private String currencySelector;

   @Override
    public String currency(String name) {


        if(name.equalsIgnoreCase("SA")){
            currencySelector="SA";
        }

        else if(name.equalsIgnoreCase("us") || name.equalsIgnoreCase("uk")){
            currencyAdapter = new CurrencyAdapter(name);
            currencySelector= currencyAdapter.currency(name);
        }

        else{
            System.out.println("Invalid Currency. " + name);
        }
        return currencySelector;
    }
}
