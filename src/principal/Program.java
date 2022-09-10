
package principal;

import controllers.FuncionarioController;

public class Program {

	public static void main(String[] args) {
		//Inicializa o objeto funcionario controller e em seguida manda cadastrar
		FuncionarioController funcionarioController = new FuncionarioController();
		funcionarioController.CadastrarFuncionario();
		

	}

}
