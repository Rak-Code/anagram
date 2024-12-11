import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimestampRecorder {
    private static String recordedMessage;
    private static ZonedDateTime recordedTimestamp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your message: ");
        recordedMessage = scanner.nextLine();

     
        recordedTimestamp = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println("Message recorded: \"" + recordedMessage + "\" at " +
                recordedTimestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

       
        ZoneId id = ZoneId.of("America/New_York");

        
        ZonedDateTime userTimestamp = recordedTimestamp.withZoneSameInstant(id);

       
        System.out.println("\nMessage: \"" + recordedMessage + "\" was recorded at: " +
                userTimestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));

        scanner.close();
    }
}
