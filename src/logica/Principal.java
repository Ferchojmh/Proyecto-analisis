package logica;

import java.util.ArrayList;

public class Principal {

	ArrayList<Evento> misEventos;
	ArrayList<Registros> misRegistros;

	public Principal(ArrayList<Evento> misEventos, ArrayList<Registros> misRegistros) {
		super();
		this.misEventos = misEventos;
		this.misRegistros = misRegistros;
	}

	public ArrayList<Evento> getMisEventos() {
		return misEventos;
	}

	public void setMisEventos(ArrayList<Evento> misEventos) {
		this.misEventos = misEventos;
	}

	public ArrayList<Registros> getMisRegistros() {
		return misRegistros;
	}

	public void setMisRegistros(ArrayList<Registros> misRegistros) {
		this.misRegistros = misRegistros;
	}

}
