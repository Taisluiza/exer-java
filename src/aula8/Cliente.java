package aula8;

public class Cliente {
	// Atributos da Classe Cliente*/
	private String nome;
	private int idade;
	private String pais;
	private String estado;
	private String cidade;
	
	
	//Metodos Construtor da Classe Cliente
	public Cliente(String nome, int idade, String pais, String estado, String cidade) {
		this.nome = nome;
		this.idade = idade;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
	
	//Metodos acessores da class
	
	
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
   //Metodo visualizar
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("País: " + pais);
		System.out.println("Estado: " + estado);
		System.out.println("Cidade: " + cidade);
	}
	
	
	
	
}
