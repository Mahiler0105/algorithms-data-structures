package arrenlazado;

public class mama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista <Integer> lt = new Lista <Integer>();
		
		Lista <String> lo = new Lista <String>();
		
		
		lt.insertarPrimero(1);
		lt.insertarPrimero(5);
		lt.insertarUltimo(9);
		lt.insertarPrimero(7);
		lt.insertarDespues(2, 55);
		lt.imprimir();
		
		lo.insertarPrimero("MAMA");
		lo.insertarPrimero("PAPA");
		lo.insertarPrimero("HERAMANA");
		lo.insertarUltimo("TIO");
		lo.imprimir();
		
		


	}

}
