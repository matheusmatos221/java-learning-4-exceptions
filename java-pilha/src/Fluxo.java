public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();        	
        }catch(Exception ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception msg: " + msg);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");	
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        //ArithmeticException exception = new ArithmeticException("Deu ruim!");
        //throw exception;
        
        //throw new ArithmeticException("DEU RUIM");
        throw new MinhaExcecao("DEU RUIM");
        //System.out.println("Fim do metodo2");        
    }
}