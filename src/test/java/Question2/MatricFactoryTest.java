package Question2;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 30/03/2017.
 */
public class MatricFactoryTest {
    @Test
    public void testGetMatricStatus() throws Exception {
     StudentAbstractFactory matricStatus=new MatricFactory();
        boolean expect=true;
        boolean result=matricStatus.getMatricStatus("matric");

        Assert.assertTrue(result);
    }

}