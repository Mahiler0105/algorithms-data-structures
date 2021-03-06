	
	public abstract class Cuenta {
		private int numeroDeCuenta;
		private float saldo;
		private Titular titu;
		public Cuenta(int a , float b, Titular c) {
			this.numeroDeCuenta = a ; 
			this.saldo = b; 
			this.titu = c;
		}
		public void deposito(float a ) {
			this.saldo+=a;
		}
		
		public void retiro(float a) {
			this.saldo-=a;
		}
		public float getSaldo() {
			return this.saldo;
		}
		
		public String toString() {
			return titu.toString()+"\nNumero de cuenta:"+this.numeroDeCuenta+"\nSaldo:"+this.saldo;
		}
	}
