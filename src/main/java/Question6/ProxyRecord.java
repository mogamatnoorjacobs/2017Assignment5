package Question6;

/**
 * Created by fatimam on 02/04/2017.
 */
public class ProxyRecord implements Record
{
    private OriganalRecord origanalRecord;
    private String recordName;

    public ProxyRecord(String recordName){
        this.recordName = recordName;
    }

    @Override
    public String viewRecord() {
        if(origanalRecord == null){
            origanalRecord = new OriganalRecord(recordName);
        }
       return origanalRecord.viewRecord();
    }

}
