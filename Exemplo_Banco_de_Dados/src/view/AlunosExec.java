package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {
	public static void main(String args[]){
		Alunos alunos = new Alunos();
		
		try{
				alunos.setNome("Vinícius Alves");
				alunos.setEndereco("Milagre dos Peixes");
				alunos.setBairro("Castro Alves");
						
				Connection connection = JdbUtil.getConnection();
				AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
				//alunosJdbcDao.salvar(alunos);
				//alunosJdbcDao.deletar();
				//alunosJdbcDao.listar();
				//alunosJdbcDao.atualizar(10,alunos);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
