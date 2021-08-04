/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;
        return dfs(node);
    }
    
    Node dfs(Node node){
        Node newNode;
        if(!map.containsKey(node)){
            newNode = new Node(node.val);
            map.put(node, newNode);
        }
        else{
            return map.get(node);
        }
        for(Node x: node.neighbors){
            Node aNeighbor = dfs(x);
            newNode.neighbors.add(aNeighbor);
        }
        
        return newNode;
    }
}
