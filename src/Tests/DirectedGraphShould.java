package Tests;

import Library.Interfaces.Graph;
import Library.Vertex;
import Tests.DSL.Create;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DirectedGraphShould {

    @Test
    public void findPathIfExist() throws Exception {
        Vertex startVertex = new Vertex<Integer>(1);
        Vertex endVertex = new Vertex<Integer>(5);
        Graph graph = Create.DeirectedGraph()
                            .withEdge(startVertex, "2")
                            .withEdge("2", "3")
                            .withEdge("2", "4")
                            .withEdge("3", endVertex)
                            .build();

        List path = graph.getPath(startVertex, endVertex);

        assertTrue(!path.isEmpty());
    }

    @Test
    public void returnNullIfPathNotExist() throws Exception {
        Vertex startVertex = new Vertex<Integer>(1);
        Vertex endVertex = new Vertex<Integer>(5);
        Graph graph = Create.DeirectedGraph()
                .withEdge(startVertex, "2")
                .withEdge("2", "7")
                .withEdge("2", "4")
                .withEdge("3", endVertex)
                .build();

        List path = graph.getPath(startVertex, endVertex);

        assertNull(path);
    }

    @Test
    public void returnEmptyListForVertex() throws Exception {
        Vertex startVertex = new Vertex<Integer>(1);
        Graph graph = Create.DeirectedGraph()
                .withEdge(startVertex, startVertex)
                .build();

        List path = graph.getPath(startVertex, startVertex);

        assertTrue(path.isEmpty());
    }

    @Test
    public void returnNoPathForEndToStart() throws Exception {
        Vertex startVertex = new Vertex<String>("start");
        Vertex endVertex = new Vertex<String>("end");
        Graph graph = Create.DeirectedGraph()
                .withEdge(startVertex, "2")
                .withEdge("2", "3")
                .withEdge("3", endVertex)
                .build();

        List path = graph.getPath(endVertex, startVertex);

        assertNull(path);
    }
}