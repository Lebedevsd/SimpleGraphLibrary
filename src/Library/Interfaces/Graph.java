package Library.Interfaces;

import Library.Vertex;

import java.util.List;

/**
 * Created by Sergey on 27.01.15.
 */
public interface Graph {

    void addVertex(Vertex vertex);
    void addEdge( Vertex fromVertex, Vertex toVertex);
    List<Edge> getPath( Vertex fromVertex, Vertex toVertex );

}
