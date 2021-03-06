package nuevo_2;
public class NodeList <E> {
	
	private	E info;
	private NodeList<E> link;

   	public NodeList(E info){
		this (info, null);    
    	}
   	public NodeList(E info, NodeList<E> link){
		this.info = info;
		this.link = link;    
    }
   	public E getInfo() {
   		return this.info;
   	}
   	public NodeList<E> getLink() {
   		return this.link;
   	}
   	public void setInfo(E info) { 
   		this.info = info; 
   	}
   	public void setLink(NodeList<E> link) { 
   		this.link = link; 
   	}
	//Function to returns the information stored in the node
	//Postcondition: Returns info.
   	public String toString(){
		return this.info.toString();
	}
} 

