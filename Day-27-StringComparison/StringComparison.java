public class StringComparison {
    
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        String str4 = "hello";
        
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));
        
        System.out.println("\nstr1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
        System.out.println("str3.compareTo(str1): " + str3.compareTo(str1));
        
        System.out.println("\nstr1 == str2: " + (str1 == str2));
        String str5 = new String("Hello");
        System.out.println("str1 == str5: " + (str1 == str5));
    }
}
