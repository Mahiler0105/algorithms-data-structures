
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BSTree <Integer> b = new BSTree <Integer>();
		try {
			
			b.insert(12);
			b.insert(14);
			b.insert(5);
			b.insert(4);
			b.insert(7);
			b.insert(3);
			b.insert(8);
			b.insert(9);
			b.insert(10);
			b.insert(15);
			b.insert(16);
			b.insert(17);
			b.insert(22);
			b.insert(28);
			b.insert(21);
			b.insert(20);
			b.insert(19);
			b.insert(26);
			b.insert(29);
			


			b.inOrden();
			
			
			System.out.println(b.longerTrajectory());
			
		}catch(ItemDuplicated e) {
			System.out.println(e.getMessage());
		}

		
		/*
		try {
			b.remove(1);
		} catch (ItemNoFound e) {
			
			System.out.println(e.getMessage());
		}*/
	
		
		
	}

}
