package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1+nota2+nota3;
	}
	public void result() {
		double min = 100*0.6;
		if (finalGrade() > min) {
			System.out.println("FINAL GRADE = " + finalGrade());
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE = " + finalGrade());
			System.out.println("FAILLED");
			double missing = min - finalGrade();
			System.out.println("MISSING "+missing+" POINTS");
		}
	}
	
}
