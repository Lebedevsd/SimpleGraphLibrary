import Library.Interfaces.Edge;
import Library.Interfaces.Graph;
import Library.UnDirectedGraph;
import Library.Vertex;

import java.util.List;

/**
 * Created by Sergey on 28.01.15.
 */
public class Program {

    public static void main(String [] args){

        Graph graph = new UnDirectedGraph();
        Vertex<Integer> _1 = new Vertex<Integer>(1);
        Vertex<Integer> _2 = new Vertex<Integer>(2);
        Vertex<Integer> _3 = new Vertex<Integer>(3);
        Vertex<Integer> _4 = new Vertex<Integer>(4);
        Vertex<Integer> _5 = new Vertex<Integer>(5);
        Vertex<Integer> _6 = new Vertex<Integer>(6);
        graph.addEdge(_1,_2);
        graph.addEdge(_2,_3);
        graph.addEdge(_6,_5);
        graph.addEdge(_5,_4);
        graph.addEdge(_1,_6);
        graph.addEdge(_3,_4);
        graph.addEdge(_5,_1);


        List<Edge> path = graph.getPath(_1, _4);

        for (Edge edge : path){
            System.out.println(edge.toString());
        }

    }

}
