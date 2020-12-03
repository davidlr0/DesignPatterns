
public class OperatorFacade {
	private Adicao adic;
	private Subtracao sub;
	private Multiplicacao mult;
	private Divisao div;
	private float num1;
	private float num2;
	
	public OperatorFacade(float n1, float n2) {
		this.adic = new Adicao();
		this.sub = new Subtracao();
		this.mult = new Multiplicacao();
		this.div = new Divisao();
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public String operation() {
		String retorno;
		retorno = "Iniciando operações com os números: " + num1 + " e " + num2;
		retorno += adic.operation(num1, num2);
		retorno += sub.operation(num1, num2);
		retorno += div.operation(num1, num2);
//		retorno += mult.operation(num1, num2);
		retorno += "\nOperações encerradas.";
		
		return retorno;
	}
	
}
