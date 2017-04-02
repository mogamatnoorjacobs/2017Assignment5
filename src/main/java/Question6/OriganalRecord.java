package Question6;

/**
 * Created by fatimam on 02/04/2017.
 */
public class OriganalRecord implements Record
{
    private String recordName;

    public OriganalRecord(String fileName){
        this.recordName = fileName;
    }

    @Override
    public String viewRecord() {
        return recordName;
    }



}
