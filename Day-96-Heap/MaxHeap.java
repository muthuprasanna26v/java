public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;
    
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }
    
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }
        
        heap[size] = value;
        int current = size;
        
        while (current > 0 && heap[current] > heap[(current - 1) / 2]) {
            int temp = heap[current];
            heap[current] = heap[(current - 1) / 2];
            heap[(current - 1) / 2] = temp;
            current = (current - 1) / 2;
        }
        
        size++;
    }
    
    public int extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        
        heapify(0);
        
        return max;
    }
    
    private void heapify(int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        
        if (largest != index) {
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }
    }
    
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);
        heap.insert(50);
        
        System.out.println("Extract max: " + heap.extractMax());
        System.out.println("Extract max: " + heap.extractMax());
    }
}
