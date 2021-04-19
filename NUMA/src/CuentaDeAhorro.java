
public class CuentaDeAhorro extends Cuenta {
	public float tasaInteres;
	
	public CuentaDeAhorro(int a , float b, Titular c , float d) {
		super(a,b , c);
		this.tasaInteres=d;
	}
	public float getSaldo() {
		return this.getSaldo();
	}
	public String toString() {
		return super.toString()+"Taza de interes:"+this.tasaInteres;
	}
}
