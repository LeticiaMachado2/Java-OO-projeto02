package repositories;

import java.io.File;

import java.io.FileOutputStream;

import java.io.PrintWriter;

import entities.Funcionario;

import interfaces.IFuncionarioRepository;

public class FuncionarioRepositoryTxt implements IFuncionarioRepository {

	// foi obrigado a implementar o metodo exportar
	@Override
	public void exportarArquivo(Funcionario funcionario) throws Exception {
		
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\temp\\funcionarios.txt"), true));

		//escrevendo os dados do arquivo
		printWriter.write("\nId do Funcionário.: " + funcionario.getId());
		printWriter.write("\nNome..............: " + funcionario.getNome());
		printWriter.write("\nMatricula.........: " + funcionario.getMatricula());
		printWriter.write("\nCpf...............: " + funcionario.getCpf());
		printWriter.write("\nData de Admissão..: " + funcionario.getDataAdmissao());
		printWriter.write("\nId do Setor.......: " + funcionario.getSetor().getIdSetor());
		printWriter.write("\nSigla do Setor....: " + funcionario.getSetor().getSigla());
		printWriter.write("\nNome do Setor.....: " + funcionario.getSetor().getNome());
		printWriter.write("\n...");
		
		//salvando e fechando o arquivo
		printWriter.flush();
		printWriter.close();
	}

}
