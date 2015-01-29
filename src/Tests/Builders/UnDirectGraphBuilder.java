package Tests.Builders;

import Library.Interfaces.Graph;
import Library.UnDirectedGraph;
import Library.Vertex;

/**
 * Created by Sergey on 29.01.15.
 */
public class UnDirectGraphBuilder{

    private Graph graph;

    public UnDirectGraphBuilder(){
        graph = new UnDirectedGraph();
    }

    public UnDirectGraphBuilder withEdge(Vertex startVertex, String s) {
        graph.addEdge(startVertex, new Vertex<String>(s));
        return this;
    }

    public UnDirectGraphBuilder withEdge(String s1, String s) {
        graph.addEdge(new Vertex<String>(s1), new Vertex<String>(s));
        return this;
    }

    public UnDirectGraphBuilder withEdge(String s1, Vertex s) {
        graph.addEdge(new Vertex<String>(s1), s);
        return this;
    }

    public UnDirectGraphBuilder withEdge(Vertex s1, Vertex s) {
        graph.addEdge(s1, s);
        return this;
    }

    public Graph build(){
        return graph;
    }
}

