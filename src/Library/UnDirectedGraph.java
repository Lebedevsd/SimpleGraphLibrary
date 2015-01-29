package Library;

import Library.Interfaces.Edge;

/**
 * Created by Sergey on 28.01.15.
 */
public class UnDirectedGraph extends DirectedGraph {

    @Override
    protected Edge createEdge(Vertex fromVertex, Vertex toVertex) {
        return new UnDirectedEdge(fromVertex, toVertex);
    }

}
