package Question3;

/**
 * Created by fatimam on 01/04/2017.
 */
public class Colour implements PrototypeInt {

    private String colour;

    private Colour(){}


    public Colour(String colour)
    {
        this.colour=colour;
    }

    @Override
    public PrototypeInt clone() {
        return new Colour(colour);
    }

}
