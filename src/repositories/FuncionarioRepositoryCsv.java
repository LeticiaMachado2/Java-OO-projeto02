package repositories;

import java.io.File;

import java.io.FileOutputStream;

import java.io.PrintWriter;


import entities.Funcionario;
import interfaces.IFuncionarioRepository;

public class FuncionarioRepositoryCsv implements IFuncionarioRepository{

	@Override
	public void exportarArquivo(Funcionario funcionario) throws Exception {
		
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\temp\\funcionarios.csv"), true));
		
		String dados = funcionario.getId() + ";"
					 + funcionario.getNome() + ";"
					 + funcionario.getCpf() + ";"
					 + funcionario.getMatricula() + ";"
					 + funcionario.getDataAdmissao() + ";"
					 + funcionario.getSetor().getIdSetor() + ";"
					 + funcionario.getSetor().getSigla() + ";"
					 + funcionario.getSetor().getNome() + "\n";
		
		//escrevendo os dados no arquivo
		printWriter.write(dados);
		
		//salvando e fechando o arquivo
		printWriter.flush();
		printWriter.close();
	}
	
}
