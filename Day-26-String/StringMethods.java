public class StringMethods {
    
    public static void main(String[] args) {
        String text = "Hello World";
        
        System.out.println("Original: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trim: '" + "  Hello  ".trim() + "'");
        System.out.println("Substring(6): " + text.substring(6));
        System.out.println("Substring(0, 5): " + text.substring(0, 5));
        System.out.println("Replace 'o' with 'a': " + text.replace('o', 'a'));
        System.out.println("Replace 'World' with 'Java': " + text.replace("World", "Java"));
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello"));
        System.out.println("Ends with 'World': " + text.endsWith("World"));
        System.out.println("Contains 'World': " + text.contains("World"));
        System.out.println("Index of 'o': " + text.indexOf('o'));
        System.out.println("Last index of 'o': " + text.lastIndexOf('o'));
        System.out.println("Equals 'Hello World': " + text.equals("Hello World"));
        System.out.println("Equals ignore case: " + text.equalsIgnoreCase("hello world"));
    }
}
