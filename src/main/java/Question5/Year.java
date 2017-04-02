package Question5;

/**
 * Created by fatimam on 02/04/2017.
 */
public abstract class Year
{
    protected CaptureYear captureYear;

    protected Year(CaptureYear captureYear){
        this.captureYear = captureYear;
    }
    public abstract int years();


}
