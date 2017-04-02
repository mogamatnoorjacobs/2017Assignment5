package Question8;

/**
 * Created by fatimam on 02/04/2017.
 */
public class Mathematics implements SubjectsAccept {
    @Override
    public void accept(DifferentSubjectsVisitor differentSubjectsVisitor) {
         differentSubjectsVisitor.visit(this);

    }
    public String mathsSubject()
    {
        return "Maths";
    }
}
