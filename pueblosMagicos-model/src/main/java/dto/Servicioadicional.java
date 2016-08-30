package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Servicioadicional generated by hbm2java
 */
@Entity
@Table(name = "servicioadicional", catalog = "pueblosMagicos")
public class Servicioadicional implements java.io.Serializable {

	private Integer idservicioAdicional;
	private String nombre;

	public Servicioadicional() {
	}

	public Servicioadicional(String nombre) {
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idservicioAdicional", unique = true, nullable = false)
	public Integer getIdservicioAdicional() {
		return this.idservicioAdicional;
	}

	public void setIdservicioAdicional(Integer idservicioAdicional) {
		this.idservicioAdicional = idservicioAdicional;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
