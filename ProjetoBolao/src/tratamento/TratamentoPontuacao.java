package tratamento;

import java.util.HashMap;
import java.util.Map;

public class TratamentoPontuacao {
	
	public static void tratarPontuacao(Map<String, String> tabelaTimesUsuario, Map<String, String> tabelaTimesReal) {
		
		 String pontuação = "0";
		
		 /*System.out.println(tabelaTimesUsuario.keySet());
		 System.out.println(tabelaTimesUsuario.values());	
		 
		 System.out.println(tabelaTimesReal.keySet());
		 System.out.println(tabelaTimesReal.values());*/	
		 
			 
		 if(tabelaTimesUsuario.get("gol1") == tabelaTimesReal.get("gol1")
				 && tabelaTimesUsuario.get("gol2") == tabelaTimesReal.get("gol2") ) {
			 
			 System.out.println("Resultado e quantidade de gols iguais. Pontuação = 30");
			 pontuação = "30";
			 tabelaTimesUsuario.put("pontuacao", pontuação);				 
		 }	
		 
		 else if (tabelaTimesUsuario.get("timeVencedor") == tabelaTimesReal.get("timeVencedor")) {
			 System.out.println("Resultado igual, quantidade de gols diferentes. Pontuação = 5");
			 pontuação = "5";
			 tabelaTimesUsuario.put("pontuacao", pontuação);	
		 }
		 
		 else {
			 System.out.println("Resultado diferente. Pontuação = 0");
		 }
	}

	public static void main(String[] args) {
		
		 Map<String, String> tabelaTimesUsuario = new HashMap<String, String>();
		 
		 Map<String, String> tabelaTimesReal = new HashMap<String, String>();
		 
		 tabelaTimesUsuario.put("time1", "Athlético Paranaense");
		 tabelaTimesUsuario.put("time2", "Coritiba");
		 tabelaTimesUsuario.put("gol1", "8");
		 tabelaTimesUsuario.put("gol2", "0");
		 tabelaTimesUsuario.put("pontuacao", "0");
		 tabelaTimesUsuario.put("timeVencedor", "Nulo");
		 		 
		 tabelaTimesReal.put("time1", "Athlético Paranaense");
		 tabelaTimesReal.put("time2", "Coritiba");
		 tabelaTimesReal.put("gol1", "8");
		 tabelaTimesReal.put("gol2", "0");
		 tabelaTimesReal.put("timeVencedor", "Nulo");
		 
		 verificarGanhador(tabelaTimesReal);
		 verificarGanhadorUsuario(tabelaTimesUsuario);
		 
		 System.out.println("O time vencedor real é : " + tabelaTimesReal.get("timeVencedor"));
		 System.out.println("O time vencedor do usuário é : " + tabelaTimesUsuario.get("timeVencedor"));
		 
		 tratarPontuacao(tabelaTimesUsuario, tabelaTimesReal);
		 
		 System.out.println("Pontuação : " + tabelaTimesUsuario.get("pontuacao") );
		 
	}
	
	public static void verificarGanhador(Map<String, String> tabelaTimesReal) {
		
		int gol1Int = Integer.parseInt(tabelaTimesReal.get("gol1"));
		int gol2Int = Integer.parseInt(tabelaTimesReal.get("gol2"));
		
		if(gol1Int >gol2Int) {
			tabelaTimesReal.put("timeVencedor", tabelaTimesReal.get("time1"));			
		}
		
		else if(gol2Int >gol1Int) {
			tabelaTimesReal.put("timeVencedor", tabelaTimesReal.get("time2"));			
		}
		else {
			tabelaTimesReal.put("timeVencedor", "Empate");	
		}	
	}
	
	public static void verificarGanhadorUsuario(Map<String, String> tabelaTimesUsuario) {
		
		int gol1Int = Integer.parseInt(tabelaTimesUsuario.get("gol1"));
		int gol2Int = Integer.parseInt(tabelaTimesUsuario.get("gol2"));
		
		if(gol1Int >gol2Int) {
			tabelaTimesUsuario.put("timeVencedor", tabelaTimesUsuario.get("time1"));			
		}
		
		else if(gol2Int >gol1Int) {
			tabelaTimesUsuario.put("timeVencedor", tabelaTimesUsuario.get("time2"));			
		}
		else {
			tabelaTimesUsuario.put("timeVencedor", "Empate");	
		}	
	}
	
	
}
