package Question4;

/**
 * Created by fatimam on 01/04/2017.
 */
public class CurrencyAdapter implements Currency
{
    OtherCurrency otherCurrency;
    private String currencySelector;

    public CurrencyAdapter(String name){

        if(name.equalsIgnoreCase("us") ){
            otherCurrency = new US();

        }else if (name.equalsIgnoreCase("uk")){
            otherCurrency = new UK();
        }
    }

    @Override
    public String currency(String name) {

        if(name.equalsIgnoreCase("us")){
            currencySelector= otherCurrency.us(name);
        }
        else if(name.equalsIgnoreCase("uk")){
            currencySelector= otherCurrency.uk(name);
        }
        return currencySelector;

    }


}
