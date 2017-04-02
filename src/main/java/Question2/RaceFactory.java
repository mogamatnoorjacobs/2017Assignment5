package Question2;

/**
 * Created by fatimam on 30/03/2017.
 */
public class RaceFactory extends StudentAbstractFactory {
    @Override
    RaceInterface getRace(String race) {


        if(race.equalsIgnoreCase("white"))
            return new White();

        else if(race.equalsIgnoreCase("coloured"))
            return new Coloured();

        return null;

    }

    @Override
    boolean getMatricStatus(String matric) {
        return false;
    }
}
