package Question2;

/**
 * Created by fatimam on 30/03/2017.
 */
public class MatricFactory extends StudentAbstractFactory {
    @Override
    RaceInterface getRace(String race) {
        return null;
    }

    @Override
    boolean getMatricStatus(String matric) {
        if(matric == null){
            return false;
        }

        if(matric.equalsIgnoreCase("matric")){
            return new HaveMatric().matricStatus();

        }else if(matric.equalsIgnoreCase("no matric")){
            return new NoMatric().matricStatus();
        }
        return false;
    }


}
