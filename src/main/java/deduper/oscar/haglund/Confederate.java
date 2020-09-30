package deduper.oscar.haglund;

import java.time.Instant;
import java.util.Calendar;
import java.util.Calendar.Builder;
import static java.sql.Timestamp.from;

public class Confederate{


    private Collaborator collaborator;

    private String dbType;

    private Instant instant;

    private Calendar.Builder calendarBuilder =  new Calendar.Builder( );

    public Confederate( Collaborator collaborator, String dbType ){

        this.collaborator = collaborator;

        this.dbType = dbType;
    }

    public void setTimeStamp( Instant instant ){

        this.instant = instant;

        Calendar gal = calendarBuilder.setDate​( 1958, 10, 30 ).build( );

        collaborator.setTimeStamp( instant.hashCode( ), from( instant ), gal );
    }
}
