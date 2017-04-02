package Question8;

/**
 * Created by fatimam on 02/04/2017.
 */
public class Subjects implements SubjectsAccept{
    public static SubjectsAccept[] subjects;

    public Subjects(){
        subjects = new SubjectsAccept[] {new Mathematics(), new Science()};
    }


    @Override
    public void accept(DifferentSubjectsVisitor differentSubjectsVisitor) {
        for (int i = 0; i < subjects.length; i++) {
            subjects[i].accept(differentSubjectsVisitor);
        }
     //  differentSubjectsVisitor.visit(this);
    }


}
