package Graph;

public class UnweightedGraph<T extends Comparable<T>> extends WeightedGraph<T, Integer> {

    public boolean addEdge(T source, T destination){
        return super.addEdge(source,destination, 1);
    }

    public boolean addUndirectedEdge(T vertex1, T vertex2){
        return addEdge(vertex1,vertex2) && addEdge(vertex2,vertex1);
    }
}