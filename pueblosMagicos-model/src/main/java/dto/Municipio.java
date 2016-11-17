package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Municipio generated by hbm2java
 */
@Entity
@Table(name = "municipio", catalog = "pueblosMagicos")
public class Municipio implements java.io.Serializable
{

	private Integer idMunicipio;
	private String nombreMunicipio;
	private Integer EIdEstado;

	public Municipio()
	{
	}

	public Municipio(Integer idMunicipio)
	{
		this.idMunicipio = idMunicipio;
	}

	public Municipio(Integer idMunicipio, String nombreMunicipio, Integer eIdEstado)
	{
		this.idMunicipio = idMunicipio;
		this.nombreMunicipio = nombreMunicipio;
		this.EIdEstado = eIdEstado;
	}

	

	@AttributeOverrides({
			@AttributeOverride(name = "idMunicipio", column = @Column(name = "idMunicipio", nullable = false)),
			@AttributeOverride(name = "EIdEstado", column = @Column(name = "e_idEstado", nullable = false)) })
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public Integer getIdMunicipio( )
	{
		return this.idMunicipio;
	}

	public void setIdMunicipio( Integer idMunicipio )
	{
		this.idMunicipio = idMunicipio;
	}

	@Column(name = "nombreMunicipio", length = 60)
	public String getNombreMunicipio( )
	{
		return this.nombreMunicipio;
	}

	public void setNombreMunicipio( String nombreMunicipio )
	{
		this.nombreMunicipio = nombreMunicipio;
	}
	
	@Column(name = "e_idEstado", nullable = false)
	public Integer getEIdEstado( )
	{
		return this.EIdEstado;
	}

	public void setEIdEstado( Integer eIdEstado )
	{
		this.EIdEstado = eIdEstado;
	}

}
