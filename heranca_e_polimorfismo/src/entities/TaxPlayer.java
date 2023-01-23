package entities;

public abstract class TaxPlayer {

	private String name;
	private double anualIncome;
	
	public TaxPlayer() {
		
	}

	public TaxPlayer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();
	
}

