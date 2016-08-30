package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipoturismo generated by hbm2java
 */
@Entity
@Table(name = "tipoturismo", catalog = "pueblosMagicos")
public class Tipoturismo implements java.io.Serializable {

	private Integer idtipoTurismo;
	private String nombre;
	private String descripcion;
	private Integer ttIdtipoTurismo;

	public Tipoturismo() {
	}

	public Tipoturismo(String nombre, String descripcion, Integer ttIdtipoTurismo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.ttIdtipoTurismo = ttIdtipoTurismo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idtipoTurismo", unique = true, nullable = false)
	public Integer getIdtipoTurismo() {
		return this.idtipoTurismo;
	}

	public void setIdtipoTurismo(Integer idtipoTurismo) {
		this.idtipoTurismo = idtipoTurismo;
	}

	@Column(name = "nombre", length = 80)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "tT_idtipoTurismo")
	public Integer getTtIdtipoTurismo() {
		return this.ttIdtipoTurismo;
	}

	public void setTtIdtipoTurismo(Integer ttIdtipoTurismo) {
		this.ttIdtipoTurismo = ttIdtipoTurismo;
	}

}
