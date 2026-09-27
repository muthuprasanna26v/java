public class SimplePrintStatements {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("World");
        
        System.out.println();
        System.out.println("This is on a new line");
        
        String name = "Java";
        int version = 17;
        System.out.printf("Language: %s, Version: %d%n", name, version);
        
        System.out.println("Tab\tSeparated");
        System.out.println("New\nLine");
        System.out.println("Backslash: \\");
        System.out.println("Quote: \"Hello\"");
    }
}
