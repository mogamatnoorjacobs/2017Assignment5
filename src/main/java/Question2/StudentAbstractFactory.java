package Question2;

/**
 * Created by fatimam on 30/03/2017.
 */
public abstract class StudentAbstractFactory {
    abstract RaceInterface getRace(String race);
    abstract boolean getMatricStatus(String matric) ;
}
