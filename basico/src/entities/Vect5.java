package entities;

public class Vect5 {
	private String name;
	private int idade;
	private double altura;
	
	public Vect5(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	
	public Vect5(String name, int idade, double altura) {
		super();
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
