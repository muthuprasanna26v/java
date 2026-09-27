import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate {
    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        
        LocalDate specificDate = LocalDate.of(2024, 12, 25);
        System.out.println("Specific date: " + specificDate);
        
        LocalDate parsedDate = LocalDate.parse("2024-12-25");
        System.out.println("Parsed date: " + parsedDate);
        
        System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Day of month: " + today.getDayOfMonth());
        System.out.println("Day of year: " + today.getDayOfYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Year: " + today.getYear());
        
        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);
        
        LocalDate nextMonth = today.plusMonths(1);
        System.out.println("Next month: " + nextMonth);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted: " + formattedDate);
    }
}
