package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Genero generated by hbm2java
 */
@Entity
@Table(name = "genero", catalog = "pueblosMagicos")
public class Genero implements java.io.Serializable
{

	private Integer idgenero;
	private String nombre;

	public Genero()
	{
	}

	public Genero(String nombre)
	{
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idgenero", unique = true, nullable = false)
	public Integer getIdgenero( )
	{
		return this.idgenero;
	}

	public void setIdgenero( Integer idgenero )
	{
		this.idgenero = idgenero;
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