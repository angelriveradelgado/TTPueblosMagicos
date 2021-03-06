package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipousuario generated by hbm2java
 */
@Entity
@Table(name = "tipousuario", catalog = "pueblosMagicos")
public class Tipousuario implements java.io.Serializable
{

	private Integer idtipoUsuario;
	private String nombre;

	public Tipousuario()
	{
	}

	public Tipousuario(String nombre)
	{
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idtipoUsuario", unique = true, nullable = false)
	public Integer getIdtipoUsuario( )
	{
		return this.idtipoUsuario;
	}

	public void setIdtipoUsuario( Integer idtipoUsuario )
	{
		this.idtipoUsuario = idtipoUsuario;
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
