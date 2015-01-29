package Tests;

import Library.Interfaces.Edge;
import Library.Vertex;
import Tests.DSL.Create;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnDirectedEdgeShould {

    @Test
    public void returnPropperLeadingVertex() throws Exception {
        Vertex<String> leadingVertex = new Vertex<String>("leading");
        Vertex<String> slaveVertex = new Vertex<String>("slave");
        Edge edge = Create.UnDirectEdge().withVertexes(leadingVertex, slaveVertex).build();

        assertTrue( leadingVertex.equals(edge.getLeadingVertex(slaveVertex)) );
        assertTrue( slaveVertex.equals(edge.getLeadingVertex(leadingVertex)) );
    }

    @Test
    public void returnPropperSlaveVertex() throws Exception {
        Vertex<String> leadingVertex = new Vertex<String>("leading");
        Vertex<String> slaveVertex = new Vertex<String>("slave");
        Edge edge = Create.UnDirectEdge().withVertexes(leadingVertex, slaveVertex).build();

        assertTrue( slaveVertex.equals(edge.getSlaveVertex(leadingVertex)) );
        assertTrue( leadingVertex.equals(edge.getSlaveVertex(slaveVertex)) );
    }

    @Test
    public void returnPropperlyCheckLeadingVertex() throws Exception {
        Vertex<String> leadingVertex = new Vertex<String>("leading");
        Vertex<Integer> slaveVertex = new Vertex<Integer>(999);
        Edge edge = Create.UnDirectEdge().withVertexes(leadingVertex, slaveVertex).build();

        assertTrue( edge.isLeadingVertex(leadingVertex) );
        assertTrue(edge.isLeadingVertex(slaveVertex));
    }

    @Test
    public void returnHumanReadableStringValue() throws Exception {
        Vertex<String> leadingVertex = new Vertex<String>("leading");
        Vertex<Integer> slaveVertex = new Vertex<Integer>(919);
        Edge edge = Create.UnDirectEdge().withVertexes(leadingVertex, slaveVertex).build();

        assertTrue( edge.toString().equals("leading - 919") );
    }

}