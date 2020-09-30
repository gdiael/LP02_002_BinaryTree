import java.util.Stack;

public class Tree {
    private Node root;

    public Tree(){
    }

    private Node getNode(Node no, Integer value){
        if(value.equals(no.value)){
            return no;
        }
        if(value < no.value){
            if(no.hasLeft()){
                return getNode(no.left, value);
            } else {
                return no;
            }
        } else {
            if(no.hasRight()){
                return getNode(no.right, value);
            } else {
                return no;
            }
        }
    }

    public boolean add(Integer value){
        if(this.root == null){
            this.root = new Node(value);
            return true;
        } else {
            Node no = getNode(root, value);
            if(!value.equals(no.value)){
                Node newNo = new Node(value);
                if(value < no.value){
                    no.left = newNo;
                } else {
                    no.right = newNo;
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

    private Integer height(Node no){
		if(no == null){
			return 0;
		} else {
			return 1 + Math.max(
				height(no.left),
				height(no.right)
			);
		}
	}
	
	public Integer height(){
		return height(root);
	}

    private Integer size(Node no){
        if(no == null){
            return 0;
        }
        return 1 + size(no.right) + size(no.left);
    }

    public Integer size(){
        return this.size(this.root);
    }

    public Boolean isFull(){
        return false;
    }

    public Boolean isComplete(){
        return false;
    }

    public Boolean isEmpty(){
        return (this.size() == 0);
    }

    private void preOrder(Node no){
		if(no != null){
            String dVal = no.value.toString() + " ";
			System.out.print(dVal);
			preOrder(no.left);
			preOrder(no.right);
		}
    }

    private void posOrder(Node no){
        if(no != null){
            String dVal = no.value.toString() + " ";
            preOrder(no.left);
            preOrder(no.right);
            System.out.print(dVal);
		}
    }

    private void inOrder(Node no){
        if(no != null){
            String dVal = no.value.toString() + " ";
            preOrder(no.left);
            System.out.print(dVal);
            preOrder(no.right);
		}
    }

    private void levelOrder(Stack<Node> pilha){
        if(!pilha.isEmpty()){
            Stack<Node> nextLevel = new Stack<>();
            String saida = "";
            while(!pilha.isEmpty()){
                Node last = pilha.pop();
                if(last != null){
                    saida += last.value.toString() + " ";
                    nextLevel.push(last.right);
                    nextLevel.push(last.left);
                }
            }
            if(saida != ""){
                System.out.println(saida);
                levelOrder(nextLevel);
            }
        }
    }

    public void preOrder(){
        this.preOrder(this.root);
        System.out.println("");
    }

    public void posOrder(){
        this.posOrder(this.root);
        System.out.println("");
    }

    public void inOrder(){
        this.inOrder(this.root);
        System.out.println("");
    }

    public void levelOrder(){
        Stack<Node> pilha = new Stack<>();
        pilha.push(this.root);
        this.levelOrder(pilha);
    }

    public void itePreOrder(){
        if(this.isEmpty()){
            return;
        }
        String saida = "";
        Stack<Node> pilha = new Stack<>();
        pilha.push(this.root);
		while(!pilha.isEmpty()){
			Node last = pilha.pop();
			saida += last.value.toString() + " ";
			if(last.hasRight()){
				pilha.push(last.right);
			}
			if(last.hasLeft()){
				pilha.push(last.left);
			}
        }
        System.out.println(saida);
    }

    public String toString(){
        return root.toString();
    }
}
