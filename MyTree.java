public class MyTree {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
 
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]= {5, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree tree=new binaryTree();

        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
