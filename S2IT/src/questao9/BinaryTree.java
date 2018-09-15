package questao9;

public class BinaryTree {
	int valor;
	BinaryTree right;
	BinaryTree left;
	
	
	public int soma() {
		return valor + (right == null ? 0 : right.soma()) 
			     + (left == null ? 0 : left.soma());
	}

}
