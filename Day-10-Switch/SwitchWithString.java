public class SwitchWithString {
    public static void main(String[] args) {
        String day = "Wednesday";
        
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Tuesday":
                System.out.println("Second day");
                break;
            case "Wednesday":
                System.out.println("Middle of the week");
                break;
            case "Thursday":
                System.out.println("Fourth day");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        String color = "red";
        
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Caution");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}
