public class Node{

    // valor contido no nó (atualmente inteiro)
    public Integer value;
    // referência ao nó filho, à diretia
    public Node right;
    // referência ao nó filho, à esquerda
    public Node left;

    public Node(Integer value){
        this.value = value;
    }

    public String toString(){
        return "Meu valor eh: " + this.value.toString();
    }
}