public class StringBuilderVsString {
    
    public static void main(String[] args) {
        long startTime, endTime;
        
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");
    }
}
