package Tests.Builders;

import Library.Interfaces.Edge;
import Library.UnDirectedEdge;
import Library.Vertex;

/**
 * Created by Sergey on 29.01.15.
 */
public class UnDirectEdgeBuilder {

    private Vertex firstVertex;
    private Vertex secondVertex;

    public UnDirectEdgeBuilder withVertexes(String firstVertexName, String secondVertexName ){
        firstVertex = new Vertex<String>(firstVertexName);
        secondVertex = new Vertex<String>(secondVertexName);
        return this;
    }

    public UnDirectEdgeBuilder withVertexes(Vertex firstVertex, Vertex secondVertex ){
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        return this;
    }

    public Edge build(){
        firstVertex = firstVertex != null ? firstVertex : new Vertex<String>("firstVertex");
        secondVertex = secondVertex != null ? secondVertex : new Vertex<String>("secondVertex");
        return new UnDirectedEdge(firstVertex, secondVertex);
    }
}