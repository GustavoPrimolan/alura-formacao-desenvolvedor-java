
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		
//		float pontoFlutuante = (float) 3.14;
		float pontoFlutuante = 3.14f;
		//CASTING - TYPE CAST
		int valor = (int) salario;
		System.out.println(valor);
		
		//2 bilhoes
		//32 bits
		int x = 2000000;
		
		//64 bits
		long numeroGrande = 2321312312312L;
		
		//16 bits
		short valorPequeno = 22131;
		
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
	
}
