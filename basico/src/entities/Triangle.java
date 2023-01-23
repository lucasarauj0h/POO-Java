package entities;
//LEMBRAR - CADA CLASSE É RESPONSAVEL POR SI MESMA
public class Triangle {
	//PUBLIC PARA PODER CHAMAR TODAS AS VARIAVEIS, DOUBLE É O TIPO DELA 
	public double a;
	public double b;
	public double c;
	
	//CRIANDO UMA FUNÇÃO DENTRO DA CLASSE QUE SERA CHAMADA]
	
	
	// DOUBLE É O TIPO DE DADO QUE O METODO RETORNA, NESSE CASO É UM DOUBLE (NUMERO FLOAT)
	// QUANDO NÃO RETORNA NADA O TIPO DE DADO É VOID 
	// O () NO AREA É A LISTA DE PARAMETRO. 
	// NESSE CASO NAO FOI PRECISO COLOCAR PARAMETROS NO () POIS OS PARAMETROS JA EXISTEM NA CLASSE
	
	public double area() {
		
		double p = (a + b + c)/2;
		double antesRaiz = p*(p-a)*(p-b)*(p-c);
		
		return Math.sqrt(antesRaiz);
	}
	
	public void showResult(double area) {
		System.out.println("Area do triangulo = " + area);
		
	}
}
