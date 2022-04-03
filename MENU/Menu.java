import javax.swing.JOptionPane;

public class Menu {	
	public static void main(String[] args) {
		new Controller().menu();
	}
}

class IO {
	static final String MENU = "MENU\n\n1. Cadastrar\n2. Pesquisar\n3. Alterar\n4. Deletar\n\n0. Sair";

	public static void show(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static int iMenu() 
		throws NumberFormatException, NullPointerException 
	{
		return Integer.parseInt(
			JOptionPane.showInputDialog(MENU));
	}
}

class Controller {
	private final GenericDAO gDAO = new DAO();

	public void menu() {
		boolean validacao = false;

		do {
			try {
				validacao = blocoCodigo(gDAO);
   			}
   			catch(Exception e) {
				System.err.println(e);
   			}
 		} while(!validacao);
	}

	public boolean blocoCodigo(GenericDAO gDAO) {
		Integer opcao = null;
		opcao = IO.iMenu();

		switch(opcao) {
			case 0: IO.show("Saindo...");
				break;

			case 1: gDAO.cadastrar();
				break;

			case 2: gDAO.pesquisar();
				break;

			case 3: gDAO.alterar();
				break;

			case 4: gDAO.deletar();
				break;

			default: IO.show("Opcao Invalida!");	
		}

		return opcao != null && opcao == 0;
	}
}

class DAO implements GenericDAO {
	public void cadastrar() {
		IO.show("Cadastrar");
	}

	public void pesquisar() {
		IO.show("Pesquisar");
	}

	public void alterar() {
		IO.show("Alterar");
	}

	public void deletar() {
		IO.show("Deletar");
	}
}

interface GenericDAO {
	void cadastrar();
	void pesquisar();
	void alterar();
	void deletar();
}