package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Servicioemergencias generated by hbm2java
 */
@Entity
@Table(name = "servicioemergencias", catalog = "pueblosMagicos")
public class Servicioemergencias implements java.io.Serializable
{

	private Integer idservicioEmergencias;
	private String nombre;
	private Integer aIdAsentamiento;
	private Double longitud;
	private Double latitud;
	private String descripcion;
	private Date horaInicio;
	private Date horaFin;

	public Servicioemergencias()
	{
	}

	public Servicioemergencias(Integer pmIdPuebloMagico)
	{
		this.aIdAsentamiento = pmIdPuebloMagico;
	}

	public Servicioemergencias(String nombre, Integer aIdAsentamiento, Double longitud, Double latitud, String descripcion,
			Date horaInicio, Date horaFin)
	{
		this.nombre = nombre;
		this.aIdAsentamiento = aIdAsentamiento;
		this.longitud = longitud;
		this.latitud = latitud;
		this.descripcion = descripcion;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idservicioEmergencias", unique = true, nullable = false)
	public Integer getIdservicioEmergencias( )
	{
		return this.idservicioEmergencias;
	}

	public void setIdservicioEmergencias( Integer idservicioEmergencias )
	{
		this.idservicioEmergencias = idservicioEmergencias;
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

	@Column(name = "a_idAsentamiento", nullable = false)
	public Integer getAIdAsentamiento( )
	{
		return this.aIdAsentamiento;
	}

	public void setAIdAsentamiento( Integer aIdAsentamiento )
	{
		this.aIdAsentamiento = aIdAsentamiento;
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

	@Column(name = "latitud", precision = 22, scale = 0)
	public Double getLatitud( )
	{
		return this.latitud;
	}

	public void setLatitud( Double latitud )
	{
		this.latitud = latitud;
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

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicio", length = 0)
	public Date getHoraInicio( )
	{
		return this.horaInicio;
	}

	public void setHoraInicio( Date horaInicio )
	{
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFin", length = 0)
	public Date getHoraFin( )
	{
		return this.horaFin;
	}

	public void setHoraFin( Date horaFin )
	{
		this.horaFin = horaFin;
	}

}
