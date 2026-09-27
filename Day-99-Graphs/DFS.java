import java.util.ArrayList;
import java.util.Stack;

class GraphDFS {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;
    
    public GraphDFS(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    
    public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(start);
        
        System.out.println("DFS starting from node " + start + ":");
        
        while (!stack.isEmpty()) {
            int node = stack.pop();
            
            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;
            }
            
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
        System.out.println();
    }
}

public class DFS {
    
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        
        graph.DFS(0);
    }
}
