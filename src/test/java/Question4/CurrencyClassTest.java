package Question4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 01/04/2017.
 */
public class CurrencyClassTest {
    @Test
    public void testCurrency() throws Exception {
        CurrencyClass currencyClass=new CurrencyClass();

        String expected="UK";
        String result=currencyClass.currency("uk");

        Assert.assertEquals(result,expected);

    }

}