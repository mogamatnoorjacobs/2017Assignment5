package Question4;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by fatimam on 01/04/2017.
 */
public class US implements OtherCurrency {
    @Override
    public String us(String name) {
        return "US";
    }

    @Override
    public String uk(String name) {
        return null;
    }
}
