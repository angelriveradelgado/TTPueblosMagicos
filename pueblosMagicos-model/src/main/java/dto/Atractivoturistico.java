package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Atractivoturistico generated by hbm2java
 */
@Entity
@Table(name = "atractivoturistico", catalog = "pueblosMagicos")
public class Atractivoturistico implements java.io.Serializable
{

	private Integer idAtractivoTuristico;
	private String nombre;
	private String descripcion;
	private Double latitud;
	private Double longitud;
	private Integer TIdUsuario;
	private Integer taIdtipoAtractivo;
	private Integer AIdUsuario;
	private Integer AIdAsentamiento;
	private Integer erIdEstadoRegistro;
	private Float promedio;

	public Atractivoturistico()
	{
	}

	public Atractivoturistico(Integer taIdtipoAtractivo, Integer erIdEstadoRegistro)
	{
		this.taIdtipoAtractivo = taIdtipoAtractivo;
		this.erIdEstadoRegistro = erIdEstadoRegistro;
	}

	public Atractivoturistico(String nombre, String descripcion, Double latitud, Double longitud, Integer TIdUsuario,
			Integer taIdtipoAtractivo, Integer AIdUsuario, Integer AIdAsentamiento, Integer erIdEstadoRegistro, Float promedio)
	{
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.TIdUsuario = TIdUsuario;
		this.taIdtipoAtractivo = taIdtipoAtractivo;
		this.AIdUsuario = AIdUsuario;
		this.AIdAsentamiento = AIdAsentamiento;
		this.erIdEstadoRegistro = erIdEstadoRegistro;
		this.promedio = promedio;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idAtractivoTuristico", unique = true, nullable = false)
	public Integer getIdAtractivoTuristico( )
	{
		return this.idAtractivoTuristico;
	}

	public void setIdAtractivoTuristico( Integer idAtractivoTuristico )
	{
		this.idAtractivoTuristico = idAtractivoTuristico;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre( )
	{
		return this.nombre;
	}

	public void setNombre( String nombre )
	{
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 65535)
	public String getDescripcion( )
	{
		return this.descripcion;
	}

	public void setDescripcion( String descripcion )
	{
		this.descripcion = descripcion;
	}

	@Column(name = "latitud", precision = 22, scale = 0)
	public Double getLatitud( )
	{
		return this.latitud;
	}

	public void setLatitud( Double latitud )
	{
		this.latitud = latitud;
	}

	@Column(name = "longitud", precision = 22, scale = 0)
	public Double getLongitud( )
	{
		return this.longitud;
	}

	public void setLongitud( Double longitud )
	{
		this.longitud = longitud;
	}

	@Column(name = "t_idUsuario")
	public Integer getTIdUsuario( )
	{
		return this.TIdUsuario;
	}

	public void setTIdUsuario( Integer TIdUsuario )
	{
		this.TIdUsuario = TIdUsuario;
	}

	@Column(name = "tA_idtipoAtractivo")
	public Integer getTaIdtipoAtractivo( )
	{
		return this.taIdtipoAtractivo;
	}

	public void setTaIdtipoAtractivo( Integer taIdtipoAtractivo )
	{
		this.taIdtipoAtractivo = taIdtipoAtractivo;
	}

	@Column(name = "a_idUsuario")
	public Integer getAIdUsuario( )
	{
		return this.AIdUsuario;
	}

	public void setAIdUsuario( Integer AIdUsuario )
	{
		this.AIdUsuario = AIdUsuario;
	}

	@Column(name = "a_idAsentamiento")
	public Integer getAIdAsentamiento( )
	{
		return this.AIdAsentamiento;
	}

	public void setAIdAsentamiento( Integer AIdAsentamiento )
	{
		this.AIdAsentamiento = AIdAsentamiento;
	}

	@Column(name = "eR_idEstadoRegistro", nullable = false)
	public Integer getErIdEstadoRegistro( )
	{
		return this.erIdEstadoRegistro;
	}

	public void setErIdEstadoRegistro( Integer erIdEstadoRegistro )
	{
		this.erIdEstadoRegistro = erIdEstadoRegistro;
	}
	
	@Column(name = "promedio")
	public Float getPromedio( )
	{
		return this.promedio;
	}

	public void setPromedio( Float promedio )
	{
		this.promedio = promedio;
	}

}
