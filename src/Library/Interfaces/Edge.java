package Library.Interfaces;

import Library.Vertex;

/**
 * Created by Sergey on 28.01.15.
 */
public interface Edge {
    boolean isLeadingVertex(Vertex vertex);
    Vertex getSlaveVertex(Vertex leadingVertex);
    Vertex getLeadingVertex(Vertex slaveVertex);
}
