package interfaces;

import entities.Funcionario;

public interface IFuncionarioRepository {
	
	//método abstrato
	
	void exportarArquivo(Funcionario funcionario) throws Exception;

}
