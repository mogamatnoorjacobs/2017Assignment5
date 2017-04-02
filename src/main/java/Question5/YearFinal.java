package Question5;

/**
 * Created by fatimam on 02/04/2017.
 */
public class YearFinal extends Year {

    private int day,month,year;

    public YearFinal(int year,CaptureYear captureYear) {
        super(captureYear);
        this.year=year;

    }

    public int years() {
        return captureYear.getYear(year);
    }

}
