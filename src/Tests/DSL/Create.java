package Tests.DSL;

import Tests.Builders.DirectEdgeBuilder;
import Tests.Builders.DirectGraphBuilder;
import Tests.Builders.UnDirectEdgeBuilder;
import Tests.Builders.UnDirectGraphBuilder;

/**
 * Created by Sergey on 29.01.15.
 */
public class Create {

    public static DirectEdgeBuilder directEdge(){
        return new DirectEdgeBuilder();
    }

    public static UnDirectEdgeBuilder UnDirectEdge() {
        return new UnDirectEdgeBuilder();
    }

    public static DirectGraphBuilder DeirectedGraph() {
        return new DirectGraphBuilder();
    }

    public static UnDirectGraphBuilder UnDeirectedGraph() {
        return new UnDirectGraphBuilder();
    }
}
