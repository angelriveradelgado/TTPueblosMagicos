package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipoevaluacion generated by hbm2java
 */
@Entity
@Table(name = "tipoevaluacion", catalog = "pueblosMagicos")
public class Tipoevaluacion implements java.io.Serializable
{

	private Integer idEvaluacion;
	private String nombre;

	public Tipoevaluacion()
	{
	}

	public Tipoevaluacion(String nombre)
	{
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEvaluacion", unique = true, nullable = false)
	public Integer getIdEvaluacion( )
	{
		return this.idEvaluacion;
	}

	public void setIdEvaluacion( Integer idEvaluacion )
	{
		this.idEvaluacion = idEvaluacion;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre( )
	{
		return this.nombre;
	}

	public void setNombre( String nombre )
	{
		this.nombre = nombre;
	}

}
