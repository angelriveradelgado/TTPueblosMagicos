package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Turista generated by hbm2java
 */
@Entity
@Table(name = "turista", catalog = "pueblosMagicos")
public class Turista implements java.io.Serializable {

	private int idUsuario;
	private Date fechaNacimiento;
	private int GIdgenero;

	public Turista() {
	}

	public Turista(int idUsuario, int GIdgenero) {
		this.idUsuario = idUsuario;
		this.GIdgenero = GIdgenero;
	}

	public Turista(int idUsuario, Date fechaNacimiento, int GIdgenero) {
		this.idUsuario = idUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.GIdgenero = GIdgenero;
	}

	@Id

	@Column(name = "idUsuario", unique = true, nullable = false)
	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaNacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "g_idgenero", nullable = false)
	public int getGIdgenero() {
		return this.GIdgenero;
	}

	public void setGIdgenero(int GIdgenero) {
		this.GIdgenero = GIdgenero;
	}

}
