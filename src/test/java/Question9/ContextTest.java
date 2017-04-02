package Question9;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 02/04/2017.
 */
public class ContextTest {
    @Test
    public void testExecuteStrategy() throws Exception {
        Context context = new Context(new AdminFee());
        double result=context.calculating(10);
        double expected=10;

        Assert.assertEquals(result,expected,0.01);
    }

}