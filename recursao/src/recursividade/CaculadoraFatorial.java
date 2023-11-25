package recursividade;

public class CaculadoraFatorial {

	private static final int MAX_ELEMENTOS = 100;
	private static final int[] elementos= new int[MAX_ELEMENTOS];
	
	public static int encontrarValor(int num) {
		
		for(int i=0; i< MAX_ELEMENTOS; i++) {
			elementos[i]=-1;
		}
		
		return calculoFatorialComRecursaoEProgramacaoDinamica(num);
		
	}
	
	public static int calculoFatorialComRecursaoEProgramacaoDinamica(int num) {
		
		if(elementos[num] == -1) {
			
			if(num == 0) {
				
				elementos[num]=1;
				
			}else {
				
				elementos[num] = num * calculoFatorialComRecursaoEProgramacaoDinamica(num-1);
				
			}
			
		}
		
		return elementos[num];
		
	}
	
	public static int calculoFatorialComRecursao(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * calculoFatorialComRecursao(num-1);
		
	}
	
}
