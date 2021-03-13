package Constructor;

public class Help {

	private String name;
	
	Help() {}
	
	Help(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Help [name: " + name + "]";
	}
}