package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import model.Alunos;

public class AlunosJdbcDAO {
	
	private Connection conn;

	public AlunosJdbcDAO(Connection conn){
		this.conn = conn;
	}

	public void salvar(Alunos c) throws SQLException {
		String sql = "insert into alunos (nome,bairro,endereco,cep) values ('"+c.getNome()+"','"+c.getBairro()+"','"+c.getEndereco()+"','"+c.getCep()+"')";
		
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
		
		

}
	public void deletar(int idSelect) throws SQLException {
		String sql = "delete from alunos where id='"+idSelect+"'";		
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
}
	
	public void atualizar(int idSelect, String novoNome,String novoEndereco,String novoBairro,String novoCEP){
		
	}
		
	}
	
}
