package Usuario;

public class TesteBanco {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		
		
		System.out.println("Numero do Banco: " + banco.getNroBanco());
		System.out.println("Nome do Banco: " + banco.getNomeBanco());
		System.out.println("Agencia: " + banco.getAgencia() );
		System.out.println("Conta: " + banco.getConta());
		
		banco.IncluirBanco("", "", "", (byte) 123);
		
		banco.consultaBanco((byte) 123);
		
		banco.setNroBanco((byte)  );
		banco.setNomeBanco("");
        banco.setAgencia();
        banco.setConta();
		
	}

}
