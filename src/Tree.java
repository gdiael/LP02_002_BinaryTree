import java.util.LinkedList;

public class Tree {
    private Node root;

    public Tree(){
        this.root = new Node(0);
    }

    public String toString(){
        return root.toString();
    }
}
