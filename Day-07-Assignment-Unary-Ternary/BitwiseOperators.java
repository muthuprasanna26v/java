public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        System.out.println("a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");
        
        int and = a & b;
        System.out.println("a & b = " + and + " (binary: " + Integer.toBinaryString(and) + ")");
        
        int or = a | b;
        System.out.println("a | b = " + or + " (binary: " + Integer.toBinaryString(or) + ")");
        
        int xor = a ^ b;
        System.out.println("a ^ b = " + xor + " (binary: " + Integer.toBinaryString(xor) + ")");
        
        int notA = ~a;
        System.out.println("~a = " + notA);
        
        int leftShift = a << 2;
        System.out.println("a << 2 = " + leftShift + " (binary: " + Integer.toBinaryString(leftShift) + ")");
        
        int rightShift = a >> 2;
        System.out.println("a >> 2 = " + rightShift + " (binary: " + Integer.toBinaryString(rightShift) + ")");
        
        int unsignedRightShift = a >>> 2;
        System.out.println("a >>> 2 = " + unsignedRightShift + " (binary: " + Integer.toBinaryString(unsignedRightShift) + ")");
    }
}
