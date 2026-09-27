public class StringPool {
    
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        
        System.out.println("s1 == s2: " + (s1 == s2));
        
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));
        
        String s5 = s3.intern();
        System.out.println("s1 == s5: " + (s1 == s5));
        
        String s6 = "World";
        String s7 = "Wor" + "ld";
        System.out.println("s6 == s7: " + (s6 == s7));
    }
}
