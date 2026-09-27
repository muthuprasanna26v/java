public class DataRange {
    public static void main(String[] args) {
        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Character range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("Boolean values: " + Boolean.FALSE + " and " + Boolean.TRUE);
        
        System.out.println("Byte size: " + Byte.BYTES + " bytes");
        System.out.println("Short size: " + Short.BYTES + " bytes");
        System.out.println("Integer size: " + Integer.BYTES + " bytes");
        System.out.println("Long size: " + Long.BYTES + " bytes");
        System.out.println("Float size: " + Float.BYTES + " bytes");
        System.out.println("Double size: " + Double.BYTES + " bytes");
        System.out.println("Character size: " + Character.BYTES + " bytes");
    }
}
