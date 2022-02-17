
public class TesteConexao {
	public static void main(String[] args) {
		try(Conexao conn = new Conexao()){
			conn.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
	}
		
		
		
//		Conexao conn = null;
//		try{
//			conn = new Conexao();
//			conn.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("Ilegal Exception");
//		}finally {			
//			conn.fecha();
//		}
//	}
}