package Testers;
import Graph.Graph;

public class GraphTester {
    public static void main(String[] args) {

        Graph g = new Graph(6);
        g.addEdge('A','B');
        g.addEdge('A','F');
        g.addEdge('A','C');
        g.addEdge('F','A');
        g.addEdge('F','B');
        g.addEdge('F','C');

        g.addEdge('F','D');
        g.addEdge('F','E');
        g.addEdge('B','A');
        g.addEdge('B','F');
        g.addEdge('B','F');
        g.addEdge('C','A');

        g.addEdge('C','F');
        g.addEdge('C','E');
        g.addEdge('E','F');
        g.addEdge('E','C');
        g.addEdge('E','D');
        g.addEdge('E','B');

        g.addEdge('D','B');
        g.addEdge('D', 'F');
        g.addEdge('D','E');

        g.print_graph();




    }
}
