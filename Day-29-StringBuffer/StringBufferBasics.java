public class StringBufferBasics {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        
        System.out.println("StringBuffer: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        sb.reverse();
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        
        String str = sb.toString();
        System.out.println("String: " + str);
    }
}
