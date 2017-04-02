import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 30/03/2017.
 */
public class SingletonTest {
    @Test
    public void testGetInstance() throws Exception
    {
        Singleton singleton = Singleton.getInstance();
        String expected="noor";
        String result=singleton.FirstName("noor");

        Assert.assertEquals(expected,result);


    }

}