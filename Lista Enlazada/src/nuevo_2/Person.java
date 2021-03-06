package nuevo_2;
public class Person implements Comparable<Person>{
	
	private String firstName;
	private String lastName;
	public Person(String first, String last){
		this.firstName=first;
		this.lastName=last;
	}
	public  int compareTo (Person x ) {
		if (this.firstName.compareTo(x.firstName) == 0) {
			return this.lastName.compareTo(x.lastName);
		}
		return this.firstName.compareTo(x.firstName) ;
	}
	public boolean equals(Object var) {
		if (!(var instanceof Person)) {
			return false;
		}
		Person p1 = (Person) var;
		return this.firstName.equals(p1.firstName) && this.lastName.equals(p1.lastName);
	}
	public void setName(String first, String last){
 		this.firstName=first;
		this.lastName=last;
 	}
	public String getName(){
		return this.firstName+" "+this.lastName;
	}
	public String toString(){ 
 		return "F:"+this.firstName+" L:"+this.lastName;
 	}
}
