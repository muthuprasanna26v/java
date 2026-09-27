import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime {
    
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);
        
        LocalTime specificTime = LocalTime.of(14, 30, 0);
        System.out.println("Specific time: " + specificTime);
        
        LocalTime parsedTime = LocalTime.parse("14:30:00");
        System.out.println("Parsed time: " + parsedTime);
        
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
        System.out.println("Nano: " + now.getNano());
        
        LocalTime plusHours = now.plusHours(2);
        System.out.println("Plus 2 hours: " + plusHours);
        
        LocalTime minusMinutes = now.minusMinutes(30);
        System.out.println("Minus 30 minutes: " + minusMinutes);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("Formatted: " + formattedTime);
    }
}
