package Question2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fatimam on 30/03/2017.
 */
public class RaceFactoryTest {
    @Test
    public void testGetRace() throws Exception
    {
        StudentAbstractFactory raceResult=new RaceFactory();
        RaceInterface expected = raceResult.getRace("white");
        RaceInterface result=raceResult.getRace("White");
        assertEquals(expected,result);
    }

}