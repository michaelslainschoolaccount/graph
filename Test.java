import java.util.*;

public class Test {
    private int testsCount = 0;

    public Test() {

    }

    public void runTests() {
        // simple graph
        Node node1 = new Node(123);
        Node node2 = new Node(234);
        Edge edge1 = new Edge(node1, node2);

        HashSet<Node> nodes = new HashSet<Node>();
        HashSet<Edge> edges = new HashSet<Edge>();

        nodes.add(node1);
        nodes.add(node2);
        edges.add(edge1);

        Graph graph = new Graph(nodes, edges);
        createTest("Simple Graph", graph);

        // cities
        HashSet<Node> cities = new HashSet<Node>();
        HashSet<Edge> roadways = new HashSet<Edge>();

        City kc = new City("Champs", 31);
        City sf = new City("NFC best", 20);
        City nash = new City("Best wildcard", 24);
        City gb = new City("Titletown", 20);
        cities.add(new Vnode(kc));
        cities.add(new Vnode(sf));
        cities.add(new Vnode(nash));
        cities.add(new Vnode(gb));

        for (Node g : cities) {
            for (Node og : cities) {
                if (weRandomlyDecideToMakeAnEdge()) {
                    roadways.add(new Edge(g, og));
                }
            }
        }

        graph = new Graph(cities, roadways);
        createTest("Cities", graph);

        // random test
        nodes = new HashSet<Node>();
        edges = new HashSet<Edge>();

        for (int i = 0; i < 10; i++) {
            Node inode = new Node(i); // a node with identifier i
            nodes.add(inode);
            for (Node node : nodes) {
                if (weRandomlyDecideToMakeAnEdge()) {
                    Edge edge = new Edge(inode, node);
                    edges.add(edge);
                }
            }
        }

        graph = new Graph(nodes, edges);
        createTest("Random", graph);
    }

    private void createTest(String name, Graph graph) {
        print(String.format("%s ::  %s", ++testsCount, name));
        print(String.format("-- %s", graph));
    }

    // I'm getting annoyed with Java syntax
    private void print(Object msg) {
        System.out.println(msg);
    }

    // Testing classes
    private class City {
        private String moniker;
        private int last;

        public City(String moniker, int lastScore) {
            this.moniker = moniker;
            this.last = lastScore;
        }

        public String toString() {
            return moniker + " last scored " + last + " points";
        }
    }

    private class Vnode extends Node {
        private Object value;

        public Vnode(Object v) {
            super(v.hashCode());
            value = v;
        }

        public String toString() {
            return value.toString();

        }
    }

    private static int count = 10;

    private static boolean weRandomlyDecideToMakeAnEdge() {
        count++;
        return (count * count * count * count) % 37 < 10;
    }
}
