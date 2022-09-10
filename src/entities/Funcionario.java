package entities;

import java.util.Date;

public class Funcionario extends Pessoa {

	// atributos
	private String matricula;
	private String cpf;
	private Date dataAdmissao;
	private Setor setor;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

}
//lampada é um dispositivo e implementa os metodos da interface
//na interface voce nao desenvolve o metodo, quem desenvolve o metodo é a classe