public class TypeConversion {
    public static void main(String[] args) {
        double d = 123.456;
        
        int i = (int) d;
        System.out.println("double to int: " + i);
        
        float f = (float) d;
        System.out.println("double to float: " + f);
        
        long l = (long) d;
        System.out.println("double to long: " + l);
        
        String str = Double.toString(d);
        System.out.println("double to String: " + str);
    }
}
