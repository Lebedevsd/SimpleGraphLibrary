package Tests.Builders;

import Library.DirectEdge;
import Library.Interfaces.Edge;
import Library.Vertex;

/**
 * Created by Sergey on 29.01.15.
 */
public class DirectEdgeBuilder {

    private Vertex firstVertex;
    private Vertex secondVertex;

    public DirectEdgeBuilder withVertexes(String firstVertexName, String secondVertexName ){
        firstVertex = new Vertex<String>(firstVertexName);
        secondVertex = new Vertex<String>(secondVertexName);
        return this;
    }

    public DirectEdgeBuilder withVertexes(Vertex firstVertex, Vertex secondVertex ){
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        return this;
    }

    public Edge build(){
        firstVertex = firstVertex != null ? firstVertex : new Vertex<String>("firstVertex");
        secondVertex = secondVertex != null ? secondVertex : new Vertex<String>("secondVertex");
        return new DirectEdge(firstVertex, secondVertex);
    }
}
