package Graph;

import java.util.LinkedList;

public class Graph {
    public int V;
    LinkedList<Character> [] adjList;
    public Graph( int v){
        this.V = v;
        adjList = new LinkedList[V];

        for (int i = 0; i <V; i++) {
            adjList[i] = new LinkedList<>();

        }

    }
    public void addEdge(char start, char end){
        int i = 0;
        int j = 0;
        //A
        if(start=='A'){
            i = 0;

        }
        if(end=='A'){
            j = 0;

        }
        //B

        if(start=='B'){
            i = 1;

        }
        if(end=='B'){
            j = 1;

        }
        //C
        if(start=='C'){
            i = 2;

        }
        if(end=='C'){
            j = 2;

        }
        //D
        if(start=='D'){
            i = 3;

        }
        if(end=='D'){
            j = 3;

        }
        //E
        if(start=='E'){
            i = 4;

        }
        if(end=='E'){
            j = 4;

        }

        //F
        if(start=='F'){
            i = 5;

        }
        if(end=='5'){
            j = 1;

        }

        adjList[i].add(end);
        //adjList[j].add(start);

    }

    public void print_graph(){
        for (int i = 0; i <V ; i++) {
            System.out.println(adjList[i] +" ->->"+ i+"Node");

        }
    }
}
