package seila;

public class Teste0 {

	public static void main(String[] args) {
		
		Teste1 teste1, teste2;
		
		teste1 = new Teste1();
		
		teste2 = teste1;
		
		System.out.println(teste1.equals(teste2));
	}

}
