package Tests.Builders;

import Library.DirectedGraph;
import Library.Interfaces.Graph;
import Library.Vertex;

/**
 * Created by Sergey on 29.01.15.
 */
public class DirectGraphBuilder {

    private Graph graph;

    public DirectGraphBuilder(){
        graph = new DirectedGraph();
    }

    public DirectGraphBuilder withEdge(Vertex startVertex, String s) {
        graph.addEdge(startVertex, new Vertex<String>(s));
        return this;
    }

    public DirectGraphBuilder withEdge(String s1, String s) {
        graph.addEdge(new Vertex<String>(s1), new Vertex<String>(s));
        return this;
    }

    public DirectGraphBuilder withEdge(String s1, Vertex s) {
        graph.addEdge(new Vertex<String>(s1), s);
        return this;
    }

    public DirectGraphBuilder withEdge(Vertex s1, Vertex s) {
        graph.addEdge(s1, s);
        return this;
    }

    public Graph build(){
        return graph;
    }
}
