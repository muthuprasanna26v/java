public class StringToNumber {
    public static void main(String[] args) {
        String intStr = "500";
        String doubleStr = "99.99";
        String longStr = "1000000";
        
        int i = Integer.parseInt(intStr);
        double d = Double.parseDouble(doubleStr);
        long l = Long.parseLong(longStr);
        
        System.out.println("String to int: " + i);
        System.out.println("String to double: " + d);
        System.out.println("String to long: " + l);
    }
}
