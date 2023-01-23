package entities;

//O final INDICA QUE ESSA CLASSE NÃO PODE SER HERDADA 
//E O final APLICADA AO METODO INDICA QUE ELE NÃO PODE SER SOBREPOSTO

public final class SavingsAccount extends AccountBank {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//SOBREPOSIÇÃO, ANOTAÇÃO @OVERRIDE
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	//NESSE CASO, COMO ESSA É UMA CONTA POUPANÇA, NÃO TEM O PORQUE TER TAXA PARA SACAR O DINHEIRO, ENTÃO
	//AO SETARMOS QUE ESSE WITHDRAW, ELE VAI REALIZAR O WITHDRAW DA SUBCLASSE (ESSE, Q NO CASO N COBRA TAXA)
	
	
	
}
