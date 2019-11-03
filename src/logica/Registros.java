package logica;

import java.util.ArrayList;

public class Registros {

	ArrayList<Cliente> misClientes;

	public Registros(ArrayList<Cliente> misClientes) {
		super();
		this.misClientes = misClientes;
	}

	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}
	
	

}
