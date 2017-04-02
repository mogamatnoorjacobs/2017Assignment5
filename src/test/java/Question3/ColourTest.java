package Question3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 01/04/2017.
 */
public class ColourTest {
    @Test
    public void testClone() throws Exception {

        Colour colour =new Colour("brown");
        Colour result=(Colour)colour.clone();

        Assert.assertNotNull(result);

    }

}