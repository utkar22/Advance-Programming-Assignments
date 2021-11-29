package assignment4;

public class Toy implements Cloneable{
	private final String name;
	
	Toy(String name){
		this.name = name;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
