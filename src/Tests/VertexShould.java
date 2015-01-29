package Tests;


import Library.Vertex;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VertexShould {

    @Test
    public void indicateThatTwoVertexesAreSame() throws Exception {
        Vertex<String> vertex1 = new Vertex<String>("Vertex1");

        Vertex<String> vertex2 = vertex1;

        assertTrue(vertex1.equals(vertex2));
    }

    @Test
    public void indicateThatTwoVertexesAreNotSame() throws Exception {
        Vertex<String> vertex1 = new Vertex<String>("Vertex1");
        Vertex<String> vertex2 = new Vertex<String>("Vertex2");

        assertFalse(vertex1.equals(vertex2));
    }

}