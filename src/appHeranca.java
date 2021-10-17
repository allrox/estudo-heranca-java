
public class appHeranca {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(0, "", "", "", "");
		Colaborador c1 = new Colaborador(0, "", "", "", "",0, "");
		
//		Utilizando método de entrada das subclasses
		u1.entrada();
		c1.entrada();	
		
//		Chama o método que desconta 6% do salário a partir de uma condição
		c1.desconta();
		
//		Utilizando método de impressão das subclasses
		u1.imprimir();
		c1.imprimir();
	}

}
