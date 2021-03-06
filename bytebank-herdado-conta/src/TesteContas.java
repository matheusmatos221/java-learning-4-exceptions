
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		ContaCorrente cc2 = new ContaCorrente(111, 114);
		cc2.deposita(100.0);
		try {
			cc2.saca(120.0);			
		}catch(SaldoInsuficienteException ex){
			System.out.println(ex.getMessage());
		}
	}
}
