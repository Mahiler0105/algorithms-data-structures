package nuevo_2;

public class ColaLink <E> implements Cola<E>{ 
	NodeList <E>pri ; 
	NodeList <E>ult ;
	int nu_ele ; 
	
	public ColaLink () {
		this.pri = new NodeList<E>(null);
		this.ult = this.pri;
		this.nu_ele = 0 ; 
	}
	public void encolar (E x) {
		if (esVacia ()) {
			this.pri.setInfo(x);
			nu_ele++;
		}else { 
		
			this.ult.setLink(new NodeList<E>(x));
			this.ult = this.ult.getLink();
			nu_ele++ ;
		}
	}
	public E descolar () {
		if (!esVacia()) {
			
			NodeList <E> aux  =  this.pri;
			this.pri = this.pri.getLink();
			aux.setLink(null);
			nu_ele--;
			return  aux.getInfo();
		}
		return null ;
	}
	public boolean esVacia () {
		if (this.pri.getInfo() == null ) {
			return true ; 
		}		
		return false; 
	}
	public E fin () {
		return this.pri.getInfo();
		
	}
	public E frente () {
		return this.ult.getInfo();
	}
	public String toString () {
		String hola  = "";
		NodeList<E> aux = this.pri;
		while (aux != null) {
			hola+=aux.getInfo();
			aux = aux.getLink();
		}
		return hola ; 
	}
}
