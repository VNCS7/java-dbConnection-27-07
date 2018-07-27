package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {
	public static void main(String args[]){
		Alunos alunos = new Alunos();
		
		try{
			
			alunos.setNome("Vinícius Alves Rodrigues");
			alunos.setEndereco("Rua Milagre dos Peixes, 52");
			alunos.setBairro("Castro Alves");
			
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			alunosJdbcDao.salvar(alunos);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
