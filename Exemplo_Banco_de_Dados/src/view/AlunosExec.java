package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {
	public static void main(String args[]){
		Alunos alunos = new Alunos();
		
		try{
			
			/*alunos.setNome("Viícius Alves Rodrigues");
			alunos.setEndereco("Rua Milagre dos Peixes,52");
			alunos.setBairro("Castro Alves");
			alunos.setCep(08474120);
			*/
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.salvar(alunos);
			//alunosJdbcDao.deletar(1);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
