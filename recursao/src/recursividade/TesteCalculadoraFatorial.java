package recursividade;

public class TesteCalculadoraFatorial {

	public static void main(String[] args) {
		
		
		//Cálculo fatorial com recursão
		int valorFatorial = CaculadoraFatorial.calculoFatorialComRecursao(5);
		
		System.out.println(valorFatorial);
		
		
		//Cálculo fatorial com recursão e programacao dinâmica

		int valorFatorial2 = CaculadoraFatorial.encontrarValor(33);
		
		System.out.println(valorFatorial2);
	}

}
