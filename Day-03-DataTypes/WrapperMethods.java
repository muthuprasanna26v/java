public class WrapperMethods {
    public static void main(String[] args) {
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("Parsed int: " + parsedInt);
        
        String doubleStr = "45.67";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("Parsed double: " + parsedDouble);
        
        String boolStr = "true";
        boolean parsedBool = Boolean.parseBoolean(boolStr);
        System.out.println("Parsed boolean: " + parsedBool);
        
        int value = 100;
        String intToStr = Integer.toString(value);
        System.out.println("int to String: " + intToStr);
        
        double dValue = 3.14159;
        String doubleToStr = Double.toString(dValue);
        System.out.println("double to String: " + doubleToStr);
        
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Max int: " + maxInt);
        System.out.println("Min int: " + minInt);
        
        int binaryResult = Integer.parseInt("1010", 2);
        System.out.println("Binary 1010 to decimal: " + binaryResult);
        
        int hexResult = Integer.parseInt("FF", 16);
        System.out.println("Hex FF to decimal: " + hexResult);
    }
}
