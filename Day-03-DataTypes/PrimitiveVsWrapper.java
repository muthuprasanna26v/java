public class PrimitiveVsWrapper {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(20);
        
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        
        double primitiveDouble = 3.14;
        Double wrapperDouble = Double.valueOf(2.718);
        
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
        
        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf('B');
        
        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Wrapper Character: " + wrapperChar);
        
        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = Boolean.valueOf(false);
        
        System.out.println("Primitive boolean: " + primitiveBoolean);
        System.out.println("Wrapper Boolean: " + wrapperBoolean);
        
        int autoBoxed = 50;
        Integer autoBoxedInteger = autoBoxed;
        System.out.println("Auto-boxed: " + autoBoxedInteger);
        
        Integer unBoxedInteger = Integer.valueOf(75);
        int unBoxed = unBoxedInteger;
        System.out.println("Un-boxed: " + unBoxed);
    }
}
