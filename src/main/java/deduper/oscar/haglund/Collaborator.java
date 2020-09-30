package deduper.oscar.haglund;

import java.sql.Timestamp;
import java.util.Calendar;

public class Collaborator{

    private Timestamp timeStamp;

    private Calendar calendar;

    private int anyInt;

    public Collaborator( ){ }

    public void setTimeStamp( int anyInt, Timestamp timeStamp, Calendar calendar ) {

        this.anyInt = anyInt;
        this.timeStamp = timeStamp;
        this.calendar = calendar;
    }

}

