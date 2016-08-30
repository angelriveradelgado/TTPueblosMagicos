package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estadoregistroservicioturistico generated by hbm2java
 */
@Entity
@Table(name = "estadoregistroservicioturistico", catalog = "pueblosMagicos")
public class Estadoregistroservicioturistico implements java.io.Serializable {

	private Integer idestadoRegistroServicioTuristico;
	private String nombre;

	public Estadoregistroservicioturistico() {
	}

	public Estadoregistroservicioturistico(String nombre) {
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idestadoRegistroServicioTuristico", unique = true, nullable = false)
	public Integer getIdestadoRegistroServicioTuristico() {
		return this.idestadoRegistroServicioTuristico;
	}

	public void setIdestadoRegistroServicioTuristico(Integer idestadoRegistroServicioTuristico) {
		this.idestadoRegistroServicioTuristico = idestadoRegistroServicioTuristico;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
