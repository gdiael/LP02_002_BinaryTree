public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Iniciando teste da classe Node");
        System.out.println("Vamos criar um Node com o valor 4 e imprimi-lo");
        Node no = new Node(4);
        System.out.println("Este eh o meu valor:");
        System.out.println(no);
        System.out.println("Vamos adicinar um Node a direita com valor 3 ");
        no.right = new Node(3);
        System.out.println(no);
        System.out.println("Vamos adicinar um Node a esquerda com valor 5 ");
        no.left = new Node(5);
        System.out.println(no);
        if(no.isFull()){
            System.out.println("Agora o Node estah cheio! ");
        } else {
            System.out.println("Ocorreu um erro! ");
        }
        System.out.println("");
        System.out.println("Iniciando teste da classe Tree");
        Tree arv = new Tree();
        arv.add(7);
		arv.add(1);
		arv.add(9);
        arv.add(11);
        System.out.println(arv);
        arv.itePreOrder();
        arv.add(8);
        System.out.println(arv);
        arv.itePreOrder();
        arv.levelOrder();
    }
}