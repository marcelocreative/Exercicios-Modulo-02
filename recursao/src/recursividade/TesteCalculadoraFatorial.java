package recursividade;

public class TesteCalculadoraFatorial {

	public static void main(String[] args) {
		
		
		//C�lculo fatorial com recurs�o
		int valorFatorial = CaculadoraFatorial.calculoFatorialComRecursao(5);
		
		System.out.println(valorFatorial);
		
		
		//C�lculo fatorial com recurs�o e programacao din�mica

		int valorFatorial2 = CaculadoraFatorial.encontrarValor(33);
		
		System.out.println(valorFatorial2);
	}

}
