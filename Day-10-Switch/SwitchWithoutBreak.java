public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        System.out.println();
        
        int month = 3;
        
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("First Quarter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Second Quarter");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Third Quarter");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Fourth Quarter");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
