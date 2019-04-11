package Principal;

import java.sql.Connection;

import banco.Conexao;

public class Principal {
	
	public static void main (String[] args) {
		
		Connection c = Conexao.conectar();
		if(c==null)
			System.out.println("Não Conectou!");
		else
			System.out.println("Conectou!");
	}
}