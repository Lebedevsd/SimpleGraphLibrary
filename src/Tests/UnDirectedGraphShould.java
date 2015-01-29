package Tests;

import Library.Interfaces.Graph;
import Library.Vertex;
import Tests.DSL.Create;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UnDirectedGraphShould {

    @Test
    public void returnPathForEndToStart() throws Exception {
        Vertex startVertex = new Vertex<String>("start");
        Vertex endVertex = new Vertex<String>("end");
        Graph graph = Create.UnDeirectedGraph()
                            .withEdge(startVertex, "2")
                            .withEdge("2", "3")
                            .withEdge("3", endVertex)
                            .build();

        List path = graph.getPath(endVertex, startVertex);

        assertTrue(!path.isEmpty());
    }

    @Test
    public void returnPathForStartToEnd() throws Exception {
        Vertex startVertex = new Vertex<String>("start");
        Vertex endVertex = new Vertex<String>("end");
        Graph graph = Create.UnDeirectedGraph()
                            .withEdge(startVertex, "2")
                            .withEdge("2", "3")
                            .withEdge("3", endVertex)
                            .build();

        List path = graph.getPath(startVertex, endVertex);

        assertTrue(!path.isEmpty());
    }

}