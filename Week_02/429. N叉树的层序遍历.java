/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
  

        if(root == null) {
            return list;
        }
        cal(root, 0);
        return list;
    }

    public void cal(Node node, int level) {
       if(list.size() <= level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(node.val);
        for(Node child: node.children) {
            cal(child, level+1);
        }
    }
}