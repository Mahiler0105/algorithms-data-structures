package arrenlazado;

public class Lista <T> {
	
	private Nodo <T> lsta; 
	
	public Lista (){
		
		this.lsta = null ; 
	}
	
	public  void  insertarPrimero (T dt ) {
		
		Nodo <T> ex = new Nodo <T> (dt);
		
		if (this.lsta == null) {
			this.lsta = ex ; 
		}else {
			ex.siguiente = this.lsta;
			this.lsta = ex ;
		}
		
	}
	
	public void insertarUltimo (T dt ) {
		Nodo <T> aux = this.lsta;
		Nodo <T>  ex = new Nodo <T> (dt); 
		
		if (aux == null ) {
			insertarPrimero (dt) ;
		}else {
			while (aux.siguiente  != null) {
				aux = aux.siguiente ; 
			}
			aux.siguiente = ex;
		}
		
		
	}
	
	
	
	public void insertarDespues (int  a , T dt ) {
		int cont = 0  ; 
		Nodo <T> aux = this.lsta ;
		Nodo  <T> ex  = new Nodo <T> (dt)  ;
		if (aux != null ) {
			while (cont < a-1 && aux.siguiente != null  ) {
				aux = aux.siguiente;
			}
			ex.siguiente = aux.siguiente;
			aux.siguiente = ex ; 
		}
	}
	
	public void imprimir () {
		Nodo <T> aux = this.lsta;
		while (aux != null) {
			System.out.print(aux.toString());
			aux= aux.siguiente ; 
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
