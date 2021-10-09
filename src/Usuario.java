import java.util.Scanner;

public class Usuario {
	
	private int rg;
	private String nome, cpf, tel, endereco;
	
	/**
	 * Getter e Setter RG
	 * @param $rg
	 */
	public void setRg(int $rg) {
		if($rg>0) {
			rg = $rg;
		}
	}
	public int getRg() {
		return rg;
	}

	/**
	 * Getter e Setter Nome
	 * @param $nome
	 */
	public void setNome(String $nome) {
		if(!$nome.isEmpty()) {
			nome = $nome;
		}
	}
	public String getNome() {
		return nome;
	}
	
	/**
	 * Getter e Setter CPF
	 * @param $cpf
	 */
	public void setCpf(String $cpf) {
		if(!$cpf.isEmpty()) {
			cpf = $cpf;
		}
	}
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Getter e Setter Telefone
	 * @param $tel
	 */
	public void setTel(String $tel) {
		if(!$tel.isEmpty()) {
			tel = $tel;
		}
	}
	public String getTel() {
		return tel;
	}
	
	/**
	 * Getter e Setter Endereço
	 * @param $endereco
	 */
	public void setEndereco(String $endereco) {
		if(!$endereco.isEmpty()){
			endereco = $endereco;
		}
	}
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * Construtor da classe Usuário 
	 * Utilize sempre o mesmo nome da classe
	 * @param rg
	 * @param nome
	 * @param cpf
	 * @param tel
	 * @param endereco
	 */
	Usuario(int rg, String nome, String cpf, String tel, String endereco) {
		this.setRg(rg);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setTel(tel);
		this.setEndereco(endereco);
	}
	
//	Método para impressão dos dados do usuário
	public void imprimir() {
		System.out.println("\nExibindo os dados do usuário:");
		System.out.println("-----------------------------");
		System.out.println("RG: " + getRg());
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Telefone: " + getTel());
		System.out.println("Endereço: " + getEndereco());
	}
	
//	Método para a entrada de dados
	public void entrada() {
		
//		Definição da função para entrada de dados
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInforme os dados solicitados:");
		
		System.out.print("RG do usuário: ");
		setRg(Integer.parseInt(scan.next()));
		
		System.out.print("Nome: ");
		setNome(scan.next());
		
		System.out.print("CPF: ");
		setCpf(scan.next());
		
		System.out.print("Telefone: ");
		setTel(scan.next());
		
		System.out.print("Endereço: ");
		setEndereco(scan.next());
		
	}

}
