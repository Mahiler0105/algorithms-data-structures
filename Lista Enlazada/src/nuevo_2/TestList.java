package nuevo_2;


	public class TestList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*
			ListaTDA<Integer> l1 = new ListLinked<Integer>();
			l1.insertFirst(10);
			l1.insertFirst(20);
			l1.insertFirst(30);
			l1.insertLast(40);
			l1.insertLast(80);
			l1.insertFirst(1);
			System.out.println(l1.toString());

			
			ListLinked<Integer> l0 = new ListLinked<Integer>();
			l0.insertFirst(10);
			l0.insertFirst(20);
			l0.insertFirst(30);
			l0.insertLast(40);
			l0.insertLast(80);
			l0.insertFirst(1);
			System.out.println(l0.toString());
			

			
		
			// LISTA ORDENADA DE ENTEROS 
			
			OrderListLinked<Integer> l2 = new OrderListLinked<Integer>();
			
			l2.insert(5);
			l2.insert(8);
			l2.insert(3);
			l2.insert(6);
			l2.insert(1);
			
			System.out.println(l2.toString());
			
			l2.deleteNode(8);
			l2.deleteNode(10);
			
			System.out.println(l2.toString());
			
			System.out.println(l2.search(10));
			System.out.println(l2.search(8));
			System.out.println(l2.search(6));
			
			// LISTA ORDENADA DE PERSONAS 
			
			
			OrderListLinked<Person> l3 = new OrderListLinked<Person>();
			
			Person [] lista = new Person [6] ;
			lista[0] = new Person ("MARIO","COAGUILA") ;
			lista[1] = new Person ("JOSE","AEDO") ;
			lista[2] = new Person ("JOHAN","JIMENEZ") ;
			lista[3] = new Person ("MARIAN","VILLANUEVA") ;
			lista[4] = new Person ("EDUARDO","ARAPA") ;
			lista[5] = new Person ("DORA","SORIA") ;
			
			for (Person i : lista) {
				l3.insert(i);
			}
			
			System.out.println(l3.toString());
			
			l3.deleteNode(lista[3]);
			l3.deleteNode(lista[0]);
			
			System.out.println(l3.toString());
			
			System.out.println(l3.search(lista[3]));
			System.out.println(l3.search(lista[0]));
			System.out.println(l3.search(lista[2]));
			*/
			ListLinked<Integer> a = new ListLinked();
			a.initializeList();
			a.insertFirst(4);
			a.insertFirst(2);
			a.insertFirst(9);
			a.insertFirst(8);
			
			System.out.println(a);
			
			System.out.println(a.Search(2));
			
			
	
		}

	}

