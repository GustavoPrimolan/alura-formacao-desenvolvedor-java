
public class TesteEscopo {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
//		boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
//		não compila
//		System.out.println(acompanhado);
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
			//ainda não existe
//			boolean acompanhado = true;
			//existe
			
		}else {
			acompanhado = false;
//			boolean acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}

	}
	
}
