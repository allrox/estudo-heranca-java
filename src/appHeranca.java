
public class appHeranca {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(0, "", "", "", "");
		Colaborador c1 = new Colaborador(0, "", "", "", "",0, "");
		
//		Utilizando m�todo de entrada das subclasses
		u1.entrada();
		c1.entrada();	
		
//		Chama o m�todo que desconta 6% do sal�rio a partir de uma condi��o
		c1.desconta();
		
//		Utilizando m�todo de impress�o das subclasses
		u1.imprimir();
		c1.imprimir();
	}

}
