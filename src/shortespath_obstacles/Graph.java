package shortespath_obstacles;

import java.util.HashSet;
import java.util.Set;

public class Graph {
 
    private Set<Node> nodes = new HashSet<Node>();
     
    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

	public Set<Node> getNodes() {
		return nodes;
	}

	public void setNodes(Set<Node> nodes) {
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "Graph [nodes=" + nodes + "]";
	}
	
	public Node getNode(Point p){
		for(Node c: nodes){
			if(c.getPoint().equals(p)){
				return c;
			}
		}
		return null;
	}
    
    
 
}