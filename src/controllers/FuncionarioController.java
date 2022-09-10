package controllers;

import java.text.SimpleDateFormat;
import java.util.EmptyStackException;
import java.util.Scanner;

import entities.Funcionario;

import entities.Setor;
import interfaces.IFuncionarioRepository;
import repositories.FuncionarioRepositoryCsv;
import repositories.FuncionarioRepositoryTxt;

public class FuncionarioController {
	
	//metodo para executar o cadastro de um funcionario
	public void CadastrarFuncionario() {
		
		try {
			//preencher os dados do funcionario
			Funcionario funcionario = new Funcionario();
			funcionario.setSetor(new Setor());
			
			funcionario.setId(1);
			funcionario.setNome("Fabio Loureiro");
			funcionario.setCpf("033.796.680-01");
			funcionario.setMatricula("2022-0001");
			funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("06/08/2022"));
			
			funcionario.getSetor().setIdSetor(1);
			funcionario.getSetor().setSigla("DESENV");
			funcionario.getSetor().setNome("Desenvolvimento de Sistemas");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Entre com (1)TXT ou (2)CSV...:");
			Integer opcao = Integer.parseInt(scanner.nextLine());
			
			IFuncionarioRepository funcionarioRepository = null; //inicializou vazio
			
			switch(opcao) {
			case 1:
				//POLIMORFISMO
				funcionarioRepository = new FuncionarioRepositoryTxt();
				break;
				
			case 2:
				//POLIMORFISMO
				funcionarioRepository = new FuncionarioRepositoryCsv();
				break;
				
			default:
				throw new Exception("Opção invalida.");
			}
			
			//gravar o arquivo
			funcionarioRepository.exportarArquivo(funcionario);
			System.out.println("\nArquivo gravado com sucesso!");
			
		
		}
		catch(Exception e) {
			System.out.println("\nFalha ao cadastrar funcionario: " + e.getMessage());
		}
	}

}
