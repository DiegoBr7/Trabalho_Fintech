package Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		
	  Usuario usuario = new Usuario() ;
	  
	  System.out.println("Nome do usuario: " + usuario.getNomeCompleto() );
	  System.out.println("CPF do usuario: " + usuario.getNrCPF() );
	  System.out.println("cdUsuario do usuario: " + usuario.getCdUsuario() );
	  System.out.println("Sexo do usuario: " + usuario.getDsSexo() );
	  System.out.println("Profissão do usuario: " + usuario.getDsProfissao() );
	  System.out.println("Email do usuario: " + usuario.getDsEmail() );
	  
	  
	  usuario.setNomeCompleto("");
	  usuario.setNrCPF("");
	  usuario.setCdUsuario("");
      usuario.setDsSexo('M');
      usuario.setDsProfissao("");
      usuario.setDsEmail("");
       
		

	}

}
