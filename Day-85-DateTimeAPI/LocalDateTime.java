import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {
    
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);
        
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 12, 25, 14, 30);
        System.out.println("Specific date and time: " + specificDateTime);
        
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-12-25T14:30:00");
        System.out.println("Parsed date and time: " + parsedDateTime);
        
        System.out.println("Date: " + now.toLocalDate());
        System.out.println("Time: " + now.toLocalTime());
        
        LocalDateTime plusDays = now.plusDays(5);
        System.out.println("Plus 5 days: " + plusDays);
        
        LocalDateTime minusHours = now.minusHours(2);
        System.out.println("Minus 2 hours: " + minusHours);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("Formatted: " + formatted);
    }
}
