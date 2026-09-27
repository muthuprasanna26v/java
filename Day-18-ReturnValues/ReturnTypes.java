public class ReturnTypes {
    
    public static int getInt() {
        return 100;
    }
    
    public static double getDouble() {
        return 3.14159;
    }
    
    public static boolean getBoolean() {
        return true;
    }
    
    public static char getChar() {
        return 'A';
    }
    
    public static String getString() {
        return "Hello, Java!";
    }
    
    public static int[] getArray() {
        return new int[]{1, 2, 3, 4, 5};
    }
    
    public static void main(String[] args) {
        int intValue = getInt();
        System.out.println("Int: " + intValue);
        
        double doubleValue = getDouble();
        System.out.println("Double: " + doubleValue);
        
        boolean boolValue = getBoolean();
        System.out.println("Boolean: " + boolValue);
        
        char charValue = getChar();
        System.out.println("Char: " + charValue);
        
        String stringValue = getString();
        System.out.println("String: " + stringValue);
        
        int[] arrayValue = getArray();
        System.out.print("Array: ");
        for (int num : arrayValue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
