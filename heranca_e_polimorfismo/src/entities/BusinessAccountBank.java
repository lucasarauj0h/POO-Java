package entities;



public class BusinessAccountBank extends AccountBank {
	
	private double loanLimite;
	
	public BusinessAccountBank() {
		super();
	}

	public BusinessAccountBank(Integer number, String holder, Double balance, double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public double getLoanLimite() {
		return loanLimite;
	}

	public void setLoanLimite(double loanLimite) {
		this.loanLimite = loanLimite;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimite) {
			balance += amount - 10;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
		//REALIZOU O WITHDRAW DA SUPER CLASSE (QUE NESSE CASO DESCONTA 5 REAIS, E LOGO APÓS O ATRIBUTO BALANCE/
		//FOI CHAMADO DENOVO PARA RETIRAR 2 REAIS. FOI ISSO QUE ACONTECEU
		//REPETINDO
		
		//REALIZOU O WITHDRAW DA CLASSE SUPER (PORQUE FOI PEDIDO ACIMA) E APOS ISSO TIROU 2 REAIS DO BALANCE, TOTALIZANDO 7 REAIS
		//O SUPER FUNCIONA COMO UM OBJETO NORMAL, SOQ NESSE CASO REFERENCIA A SUPER CLASSE DESSA SUBCLASSE
		// acc.withdraw(amount); <---- como se fosse isso
	}
	
	

}
