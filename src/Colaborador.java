import java.util.Scanner;

public class Colaborador extends Usuario {

	private double salario;
	private String funcao;
	
	/**
	 * Getter e Setter Salário
	 * @param $salario
	 */
	public void setSalario(double $salario) {
		if($salario>0) {
			salario = $salario;
		}
	}
	public double getSalario() {
		return salario;
	}
	
	/**
	 * Getter e Setter Funcao
	 * @param $funcao
	 */
	public void setFuncao(String $funcao) {
		if(!$funcao.isEmpty());
		funcao = $funcao;
	}
	public String getFuncao() {
		return funcao;
	}
	
	/**
	 * Construtor da classe Colaborador
	 * @param rg
	 * @param nome
	 * @param cpf
	 * @param tel
	 * @param endereco
	 * @param salario
	 */
	Colaborador(int rg, String nome, String cpf, String tel, String endereco, double salario) {
		super(rg, nome, cpf, tel, endereco);
	}	
	
//	Método para impressão dos dados do colaborador
//	Utiliza a palavra reservada super para chamar dados da superclasse
	public void imprimir() {
		super.imprimir();
		System.out.println("Função: " + this.getFuncao());
		System.out.println("Salário: " + this.getSalario());
	}
	
	public void entrada() {
		
//		Definição da função para entrada de dados
		Scanner scan = new Scanner(System.in);
		
//		Utiliza o método de entrada da Superclasse
		super.entrada();
		
		System.out.print("Função: ");
		setFuncao(scan.next());
		
		System.out.print("Salário: ");
		setSalario(Double.parseDouble(scan.next()));
		
		scan.close();
	}
	
//	Função para realizar desconto sobre salário superior a uma condição
	public void desconta(){
		if(this.salario>1000) {
			this.setSalario(salario *= .94);	
		} return;	
	}
	
	
}
