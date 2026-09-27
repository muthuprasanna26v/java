public class StringImmutability {
    
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        
        str1 = str1 + " World";
        
        System.out.println("\nAfter str1 = str1 + ' World':");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        
        String str3 = "Java";
        String str4 = "Java";
        
        System.out.println("\nstr3 == str4: " + (str3 == str4));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
        
        String str5 = new String("Java");
        String str6 = new String("Java");
        
        System.out.println("str5 == str6: " + (str5 == str6));
        System.out.println("str5.equals(str6): " + str5.equals(str6));
    }
}
