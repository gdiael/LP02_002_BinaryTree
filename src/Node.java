public class Node{

    // valor contido no nó (atualmente inteiro)
    public Integer value;
    // referência ao nó filho, à diretia
    public Node right;
    // referência ao nó filho, à esquerda
    public Node left;

    // construtor
    public Node(Integer value){
        this.value = value;
    }

    // verifica se tem nó filho a direita
    public Boolean hasRight(){
        return this.right != null;
    }

    // verifica se tem nó filho a esquerda
    public Boolean hasLeft(){
        return this.left != null;
    }

    // verifica se o tem está cheio (tem filho a direita e a esquerda)
    public Boolean isFull(){
        return this.hasRight() && this.hasLeft();
    }

    // verifica se o nó é estritamente binario (tem 0 ou dois filhos)
    public Boolean isEstrictBin(){
        return this.isFull() || this.isLeaf();
    }

    // verifica se o nó está vazio (não tem filhos)
    public Boolean isLeaf(){
        return !this.hasRight() && !this.hasLeft();
    }

    // imprime este nó e seus filhos
    public String toString(){
        String val = this.value.toString();
        String eStr = (this.hasLeft() ? this.left.toString() : "");
        String dStr = (this.hasRight() ? " " + this.right.toString() : "");
        return val + "(" + eStr + "," + dStr + ")";
    }
}
