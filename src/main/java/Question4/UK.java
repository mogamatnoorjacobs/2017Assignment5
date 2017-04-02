package Question4;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by fatimam on 01/04/2017.
 */
public class UK implements OtherCurrency
{
    @Override
    public String us(String name) {
        return null;
    }

    @Override
    public String uk(String name) {
        return "UK";
    }
}
