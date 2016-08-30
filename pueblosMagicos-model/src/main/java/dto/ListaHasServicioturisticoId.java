package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ListaHasServicioturisticoId generated by hbm2java
 */
@Embeddable
public class ListaHasServicioturisticoId implements java.io.Serializable {

	private int listaIdlista;
	private int servicioTuristicoIdServicio;
	private int turistaIdUsuario;

	public ListaHasServicioturisticoId() {
	}

	public ListaHasServicioturisticoId(int listaIdlista, int servicioTuristicoIdServicio, int turistaIdUsuario) {
		this.listaIdlista = listaIdlista;
		this.servicioTuristicoIdServicio = servicioTuristicoIdServicio;
		this.turistaIdUsuario = turistaIdUsuario;
	}

	@Column(name = "lista_idlista", nullable = false)
	public int getListaIdlista() {
		return this.listaIdlista;
	}

	public void setListaIdlista(int listaIdlista) {
		this.listaIdlista = listaIdlista;
	}

	@Column(name = "servicioTuristico_idServicio", nullable = false)
	public int getServicioTuristicoIdServicio() {
		return this.servicioTuristicoIdServicio;
	}

	public void setServicioTuristicoIdServicio(int servicioTuristicoIdServicio) {
		this.servicioTuristicoIdServicio = servicioTuristicoIdServicio;
	}

	@Column(name = "Turista_idUsuario", nullable = false)
	public int getTuristaIdUsuario() {
		return this.turistaIdUsuario;
	}

	public void setTuristaIdUsuario(int turistaIdUsuario) {
		this.turistaIdUsuario = turistaIdUsuario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ListaHasServicioturisticoId))
			return false;
		ListaHasServicioturisticoId castOther = (ListaHasServicioturisticoId) other;

		return (this.getListaIdlista() == castOther.getListaIdlista())
				&& (this.getServicioTuristicoIdServicio() == castOther.getServicioTuristicoIdServicio())
				&& (this.getTuristaIdUsuario() == castOther.getTuristaIdUsuario());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getListaIdlista();
		result = 37 * result + this.getServicioTuristicoIdServicio();
		result = 37 * result + this.getTuristaIdUsuario();
		return result;
	}

}
