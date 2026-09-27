public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        
        double d = 100.5;
        int i = (int) d;
        System.out.println("double to int: " + i);
        
        float f = 99.99f;
        int j = (int) f;
        System.out.println("float to int: " + j);
        
        long l = 100000L;
        short s = (short) l;
        System.out.println("long to short: " + s);
        
        char c = 'A';
        int charToInt = c;
        System.out.println("char to int: " + charToInt);
        
        int k = 66;
        char intToChar = (char) k;
        System.out.println("int to char: " + intToChar);
    }
}
