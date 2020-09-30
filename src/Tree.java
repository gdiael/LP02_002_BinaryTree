import java.util.LinkedList;

public class Tree {
    private Node root;

    public Tree(){
    }


    private Node getNode(Node node, Integer value){
        if(value.equals(node.value)){
            return node;
        }
        if(value < node.value){
            if(node.hasLeft()){
                return getNode(node.left, value);
            } else {
                return node;
            }
        } else {
            if(node.hasRight()){
                return getNode(node.right, value);
            } else {
                return node;
            }
        }
    }

    public boolean add(Integer value){
        if(root == null){
            root = new Node(value);
            return true;
        } else {
            Node node = getNode(root, value);
            if(!value.equals(node.value)){
                Node newNode = new Node(value);
                if(value < node.value){
                    node.left = newNode;
                } else {
                    node.right = newNode;
                }
                return true;
            }
        }
        return false;
    }

    public Boolean contains(Integer value){
        Node no = this.getNode(this.root, value);
        return value.equals(no.value);
    }

    

    public String toString(){
        return root.toString();
    }
}
