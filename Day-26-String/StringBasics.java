public class StringBasics {
    
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Java";
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        
        String concatenated = str1 + " " + str2 + " " + str3;
        System.out.println("Concatenated: " + concatenated);
        
        String empty = "";
        String nullString = null;
        
        System.out.println("Empty string length: " + empty.length());
        System.out.println("Is empty string empty? " + empty.isEmpty());
        
        System.out.println("str1 length: " + str1.length());
        System.out.println("str1 char at 0: " + str1.charAt(0));
        System.out.println("str1 char at 4: " + str1.charAt(4));
    }
}
