package logica;

import com.toedter.calendar.JCalendar;

public class Evento {

	String nombreR;
	String identificacionR;
	String telefonoR;
	String nombreE;
	JCalendar fechaE;
	String horaE;
	String lugarE;
	double precioB;
	String infoAdiconal;

	public Evento(String nombreR, String identificacionR, String telefonoR, String nombreE, JCalendar fechaE,
			String horaE, String lugarE, double precioB, String infoAdiconal) {
		super();
		this.nombreR = nombreR;
		this.identificacionR = identificacionR;
		this.telefonoR = telefonoR;
		this.nombreE = nombreE;
		this.fechaE = fechaE;
		this.horaE = horaE;
		this.lugarE = lugarE;
		this.precioB = precioB;
		this.infoAdiconal = infoAdiconal;
	}

	public String getNombreR() {
		return nombreR;
	}

	public void setNombreR(String nombreR) {
		this.nombreR = nombreR;
	}

	public String getIdentificacionR() {
		return identificacionR;
	}

	public void setIdentificacionR(String identificacionR) {
		this.identificacionR = identificacionR;
	}

	public String getTelefonoR() {
		return telefonoR;
	}

	public void setTelefonoR(String telefonoR) {
		this.telefonoR = telefonoR;
	}

	public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	public JCalendar getFechaE() {
		return fechaE;
	}

	public void setFechaE(JCalendar fechaE) {
		this.fechaE = fechaE;
	}

	public String getHoraE() {
		return horaE;
	}

	public void setHoraE(String horaE) {
		this.horaE = horaE;
	}

	public String getLugarE() {
		return lugarE;
	}

	public void setLugarE(String lugarE) {
		this.lugarE = lugarE;
	}

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}

	public String getInfoAdiconal() {
		return infoAdiconal;
	}

	public void setInfoAdiconal(String infoAdiconal) {
		this.infoAdiconal = infoAdiconal;
	}
	
	
	

}
