package toString;

public class Car {

	public String name, taste;
	
	Car(String name, String taste) {
		this.name = name;
		this.taste = taste;
	}
	
	Car() {
		this("Ryan", "Cience");
	}
	
	public String toString() {
		return (this.name+" and "+this.taste);
	}
	
}