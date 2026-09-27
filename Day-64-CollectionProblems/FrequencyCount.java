import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyCount {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(1);
        
        HashMap<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : list) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Frequency: " + frequency);
    }
}
