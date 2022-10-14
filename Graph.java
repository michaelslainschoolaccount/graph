import java.util.*;

public class Graph {
    private Set<Node> nodes;
    private Set<Edge> edges;

    public Graph(Set<Node> nodes, Set<Edge> edges) {
        this.nodes = new HashSet<Node>();
        this.edges = new HashSet<Edge>();

        for (Node node : nodes)
            this.nodes.add(node);
        for (Edge edge : edges)
            this.edges.add(edge);
    }

    public Set<Node> children(Node node) {
        HashSet<Node> retval = new HashSet<Node>();

        for (Edge edge : edges) {
            Node end = edge.getEnd();
            Node start = edge.getStart();

            if (start.equals(node))
                retval.add(end);

        }

        return retval;
    }

    public String toString() {
        String retval = "A graph with nodes as follows:\n";

        for (Node n : nodes)
            retval += n.toString() + " ";

        retval += "\n And edges as follows: \n";

        for (Edge e : edges)
            retval += e.toString() + "\n";

        retval += "\n";
        return retval;
    }

}
