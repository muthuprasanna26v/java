public class RemoveSpaces {
    
    public static String removeAllSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
    
    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }
    
    public static void main(String[] args) {
        String text = "  Hello   World  Java  ";
        
        System.out.println("Original: '" + text + "'");
        System.out.println("Remove all spaces: '" + removeAllSpaces(text) + "'");
        System.out.println("Remove extra spaces: '" + removeExtraSpaces(text) + "'");
    }
}
