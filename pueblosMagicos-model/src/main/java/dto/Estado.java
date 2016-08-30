package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name = "estado", catalog = "pueblosMagicos")
public class Estado implements java.io.Serializable {

	private Integer idEstado;
	private String nombreEstado;

	public Estado() {
	}

	public Estado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEstado", unique = true, nullable = false)
	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	@Column(name = "nombreEstado", length = 45)
	public String getNombreEstado() {
		return this.nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

}
