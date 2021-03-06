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
							System.out.print("hola");
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
				/*
				Node aux2 = aux.left; Node pad2 = aux;
				while (aux2.right != null) {
					pad2 = aux2;
					aux2 = aux2.right;
				}
				if (aux2.right == null  &&  aux2.left == null) {
					remove1(pad2,x) ;
				}else if () {
					
				}*/
			}
		}
		
	}
	
	public String toString() {
		return "";
	}
	
	public  int no_hojas( ) {
		return no_hojas(this.root , 0 );	
	}
	public  int no_hojas(Node actual , int cont ) { 
		if (actual != null) {
			no_hojas(actual.left, cont );
			

			if (!(actual.right != null && actual.left != null)) {
				cont++;
			}
			no_hojas(actual.right, cont );
			
			
		}
		return cont;


	}
	
	public  ArrayList<E> longerTrajectory () {
		ArrayList<E> nuevo = new ArrayList<E>();
		ArrayList<Integer> nueva = new ArrayList<Integer>();
		nueva.add(0);nueva.add(1);
		return longerTrajectory(this.root, nuevo, 0, nueva);
	}	
	
	protected ArrayList<E> longerTrajectory(Node actual, ArrayList<E> nuev, int max, ArrayList<Integer> nueva) {
		if (actual != null) {
			longerTrajectory(actual.left, nuev , max+1, nueva);
			longerTrajectory(actual.right, nuev, max+1, nueva);
			if (actual.left == null && actual.right == null) {
				System.out.println("-"+max+"-"+actual.data);
				if ( max > nueva.get(0)  ) {
					nuev.clear();
					nuev.add(actual.data);
					nueva.add(0, max);nueva.add(1, 1);
					
				}else{
					nueva.add(1, 0);
				}
			}else {
				if ( max < nueva.get(0) && nueva.get(1) == 1  ) {
					nuev.add(actual.data);
				}else if (max >= (nueva.get(0)/2+1)+1) {
					nueva.add(1,1);
				}
			}
			System.out.println(nueva.get(0));
		}
		return nuev ; 
	}
	
	public void inOrden(){
		
		inOrden(this.root);

	}
		
	protected void inOrden(Node actual){
		
		if (actual != null) {
			inOrden(actual.left);
			System.out.println(actual.data+", ");
			
			inOrden(actual.right);
		}
	}
	
}

