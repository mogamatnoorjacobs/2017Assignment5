package Question5;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 02/04/2017.
 */
public class YearFinalTest {
    @Test
    public void testYears() throws Exception {
        Year type=new YearFinal(1654,new YearBorn());

        int result=type.years();
        int expected=1654;
        Assert.assertEquals(result,expected);
    }

}