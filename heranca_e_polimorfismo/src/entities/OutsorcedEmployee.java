package entities;

public class OutsorcedEmployee extends Employee{
	
	private double additionalCharge;
	
	public OutsorcedEmployee() {
		
	}

	public OutsorcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		double salary = super.payment();
		salary += 1.1* additionalCharge;
		return salary;
	}
}