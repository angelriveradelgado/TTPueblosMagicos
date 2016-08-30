package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estadoregistroestablecimiento generated by hbm2java
 */
@Entity
@Table(name = "estadoregistroestablecimiento", catalog = "pueblosMagicos")
public class Estadoregistroestablecimiento implements java.io.Serializable {

	private Integer idestadoRegistroEstablecimiento;
	private String nombre;

	public Estadoregistroestablecimiento() {
	}

	public Estadoregistroestablecimiento(String nombre) {
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idestadoRegistroEstablecimiento", unique = true, nullable = false)
	public Integer getIdestadoRegistroEstablecimiento() {
		return this.idestadoRegistroEstablecimiento;
	}

	public void setIdestadoRegistroEstablecimiento(Integer idestadoRegistroEstablecimiento) {
		this.idestadoRegistroEstablecimiento = idestadoRegistroEstablecimiento;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
