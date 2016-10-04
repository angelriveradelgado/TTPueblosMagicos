package dto;
// Generated 4/09/2016 01:21:51 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estadoregistropst generated by hbm2java
 */
@Entity
@Table(name = "estadoregistropst", catalog = "pueblosMagicos")
public class Estadoregistropst implements java.io.Serializable {

	private Integer idEstadoRegistro;
	private String estado;

	public Estadoregistropst() {
	}

	public Estadoregistropst(String estado) {
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEstadoRegistro", unique = true, nullable = false)
	public Integer getIdEstadoRegistro() {
		return this.idEstadoRegistro;
	}

	public void setIdEstadoRegistro(Integer idEstadoRegistro) {
		this.idEstadoRegistro = idEstadoRegistro;
	}

	@Column(name = "estado", length = 45)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
