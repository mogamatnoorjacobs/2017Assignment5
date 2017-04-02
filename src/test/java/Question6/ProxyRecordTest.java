package Question6;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 02/04/2017.
 */
public class ProxyRecordTest {
    @Test
    public void testViewRecord() throws Exception {

        Record record=new ProxyRecord("test.doc");
        String result= record.viewRecord();
        String expected="test.doc";

        Assert.assertEquals(result,expected);

    }

}