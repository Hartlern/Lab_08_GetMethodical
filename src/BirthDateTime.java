import java.util.Scanner;

public class BirthDateTime
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner( System.in );

        // Get Year, Month, Day, Hour, and Minute
        int year = SafeInput.getRangedInt( scanner, "Enter your birth year", 1950, 2015 );
        int month = SafeInput.getRangedInt( scanner, "Enter your birth month", 1, 12 );
        int day = SafeInput.getRangedInt( scanner, "Enter your birth day", 1 , getDayOfMonth(month) );
        int hour = SafeInput.getRangedInt( scanner, "Enter your birth hour", 0, 23 );
        int minute = SafeInput.getRangedInt( scanner, "Enter your birth minute", 0, 59 );

        System.out.printf( "You were born on: %04d-%02d-%02d %02d:%02d%n", year, month, day, hour, minute );

    }

    public static int getDayOfMonth( int month )
    {
        int maxDays;

        switch( month )
        {
            case 2: // February
                maxDays = 29; //leap year
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                maxDays = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                break;
            default:
                maxDays = -1;
        }
        return ( maxDays );
    }
}
