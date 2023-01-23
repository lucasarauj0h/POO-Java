package entities;

public class Pensionato {

	private String name;
	private String email;
	private int key; 
	
	
	public Pensionato(String name, String email, int key) {
		super();
		this.name = name;
		this.email = email;
		this.key = key;
	}


	public Pensionato(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nome: "
				+ name
				+ "\ne-mail: "
				+ email
				+ "\nQuarto escolhido: "
				+ key;
	}
	
	
}
