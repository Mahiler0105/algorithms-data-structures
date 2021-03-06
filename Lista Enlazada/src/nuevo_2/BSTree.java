package nuevo_2;
import java.util.ArrayList;

public class BSTree<E extends Comparable<E>> {
	class Node {
		protected E data;
		protected Node left, right;
		public Node(E data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		public Node(E data) {
			this (data,null,null);
		}
		public String  toString () {
			return ""+this.data + this.left;
		}
	}
	private Node root;
	public BSTree(){ 
		this.root = null; 
	}
	public boolean isEmpty(){ 
		return this.root == null;
	}
	public void insert(E x) throws ItemDuplicated {
		if (isEmpty()) {
			this.root = new Node (x);
		}else {
			Node aux = this.root;
			Node pad =  null;
			while (aux != null) {
				if (aux.data.equals(x)) {
					throw new ItemDuplicated("El elemento ya esta en el arbol ");
				}else {
					pad = aux;  
					if (aux.data.compareTo(x)> 0) {
						aux = aux.left;
					}else {
						aux = aux.right;
					}
				}
			}
			if (pad.data.compareTo(x)> 0 ) {
				pad.left = new Node(x);
			}else {
				pad.right = new Node (x);
			}
		}
	}	
	protected Node search(E x) throws ItemNoFound {
		if (!isEmpty()) {
			Node aux = this.root;
			while (aux!= null && !aux.data.equals(x) ) {
					if (aux.data.compareTo(x)> 0) {
						aux = aux.left;
					}else {
						aux = aux.right;
					}
			}
			if (aux == null) {   //  con equals salia error al  comparar un null con un dato  
				throw new ItemNoFound("El elemento no existe ");
			}
			return aux;
		}else {
			return null;  // retorna null si la lista esta vacia 
		}
	}
	public E Search(E x) throws ItemNoFound {
		return search(x).data;
	}	
	

	public void remove(E x) throws ItemNoFound {
		Node aux = this.root;
		Node pad  = null; 
		while (aux!= null && !aux.data.equals(x)  ) {
			if (aux.data.compareTo(x)> 0) {
				pad = aux;
				aux = aux.left;
			}else {
				pad = aux;
				aux = aux.right;
			}
		}
		if (aux == null ) {
			throw new ItemNoFound("El elemento no existe ");
		}else {
			if (aux.left== null && aux.right == null ) {
				if (pad != null) {
					if (pad.data.compareTo(x)>0) {
						pad.left = null;
					}else {
						pad.right = null ; 
					}
				}else {
					this.root = null ;
				}
			}else if ( (aux.left != null &&  aux.right == null)   || (aux.left == null &&  aux.right != null)) {
				if (pad != null) {
					if (pad.data.compareTo(x) > 0 ){
						if (aux.left == null) {
							pad.left = aux.right;
						}else {
							pad.left = aux.left;	
						}	
					}else {
						if (aux.left == null) {
							pad.right = aux.right;
						}else {
							pad.right = aux.left;
						}
					}
				}else {
					if (aux.left == null) {
						this.root = aux.right;
					}else {
						this.root = aux.left;
					}
				}
			}else{
				
				Node aux2 = aux.right; Node pad2 = aux;
				while (aux2.left != null) {
					pad2 = aux2;
					aux2 = aux2.left;
				}
				if (aux2.right == null  &&  aux2.left == null) {
					pad2.data = aux2.data;
					pad2.right = null ;
				}else {
					pad2.data = aux2.right.data;
					aux2.left = null;
					
				}
			}
		}
		
	}

	public ArrayList<E> mayor () {
		int con2 = 0 ; 
		int con = 0 ;
		Node a = this.root;
		ArrayList<E> o = new ArrayList<E>();
		ArrayList<E> o2 = new ArrayList<E>();
		Node b = null ; 
		boolean flag = true ;
		while (flag)  {
			while (a != null) {
				if (a.left != null && a.right == null ) {
					con++;
					o.add(a.data);
					a = a.left;
				}else if (a.right != null && a.left == null ) {
					o.add(a.data);
					a = a.right;
					con++;
				}else if (a.right ==  null && a.left == null){
					break ;
				}
				else {
					if (b != null) {
						o.add(a.data);
						a = a.right;
						con++;
					}else {
						b = a ;
						o.add(a.data);
						con++;
						a = a.left;
					}
				}
			}
			if (con > con2) {
				con2 = con ;
				o2 = o ; 
			}
			a = this.root;
			
		} 
		return o ; 
	}

	protected void masmas(Node actual, int cont ){
		if (actual != null) {
			masmas(actual.left,cont+1 );
			System.out.print(actual.data+", ");
			
			masmas(actual.right, cont+1);
		}
	}
	
	
	public String toString() {
		return ""+this.root;
	}
	public void inOrden(){
		
		inOrden(this.root);

	}
		
	protected void inOrden(Node actual){
		
		if (actual != null) {
			inOrden(actual.left);
			System.out.print(actual.data+", ");
			inOrden(actual.right);
		}
	}
}

