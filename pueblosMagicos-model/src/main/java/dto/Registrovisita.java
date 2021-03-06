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
 * Registrovisita generated by hbm2java
 */
@Entity
@Table(name = "registrovisita", catalog = "pueblosMagicos")
public class Registrovisita implements java.io.Serializable
{

	private Integer idregistroVisita;
	private Integer TIdUsuario;
	private Integer EIdEstablecimiento;
	private Integer pmIdPuebloMagico;
	private Integer atIdAtractivoTuristico;
	private Integer stIdServicioTuristico;	
	private Date fecha;
	private Integer evaluado;

	public Registrovisita()
	{
	}

	public Registrovisita(Integer TIdUsuario)
	{
		this.TIdUsuario = TIdUsuario;
	}

	public Registrovisita(Integer TIdUsuario, Integer EIdEstablecimiento, Integer pmIdPuebloMagico,
			Integer atIdAtractivoTuristico, Integer stIdServicioTuristico, Date fecha, Integer evaluado)
	{
		this.TIdUsuario = TIdUsuario;
		this.EIdEstablecimiento = EIdEstablecimiento;
		this.pmIdPuebloMagico = pmIdPuebloMagico;
		this.atIdAtractivoTuristico = atIdAtractivoTuristico;
		this.fecha = fecha;
		this.evaluado = evaluado;
		this.stIdServicioTuristico = stIdServicioTuristico;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idregistroVisita", unique = true, nullable = false)
	public Integer getIdregistroVisita( )
	{
		return this.idregistroVisita;
	}

	public void setIdregistroVisita( Integer idregistroVisita )
	{
		this.idregistroVisita = idregistroVisita;
	}

	@Column(name = "t_idUsuario", nullable = false)
	public Integer getTIdUsuario( )
	{
		return this.TIdUsuario;
	}

	public void setTIdUsuario( Integer TIdUsuario )
	{
		this.TIdUsuario = TIdUsuario;
	}

	@Column(name = "e_idEstablecimiento")
	public Integer getEIdEstablecimiento( )
	{
		return this.EIdEstablecimiento;
	}

	public void setEIdEstablecimiento( Integer EIdEstablecimiento )
	{
		this.EIdEstablecimiento = EIdEstablecimiento;
	}

	@Column(name = "pM_idPuebloMagico")
	public Integer getPmIdPuebloMagico( )
	{
		return this.pmIdPuebloMagico;
	}

	public void setPmIdPuebloMagico( Integer pmIdPuebloMagico )
	{
		this.pmIdPuebloMagico = pmIdPuebloMagico;
	}

	@Column(name = "aT_idAtractivoTuristico")
	public Integer getAtIdAtractivoTuristico( )
	{
		return this.atIdAtractivoTuristico;
	}

	public void setAtIdAtractivoTuristico( Integer atIdAtractivoTuristico )
	{
		this.atIdAtractivoTuristico = atIdAtractivoTuristico;
	}
	
	@Column(name = "sT_idServicioTuristico")
	public Integer getStIdServicioTuristico( )
	{
		return this.stIdServicioTuristico;
	}

	public void setStIdServicioTuristico( Integer stIdServicioTuristico )
	{
		this.stIdServicioTuristico = stIdServicioTuristico;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", length = 0)
	public Date getFecha( )
	{
		return this.fecha;
	}

	public void setFecha( Date fecha )
	{
		this.fecha = fecha;
	}
	
	@Column(name = "evaluado")
	public Integer getEvaluado( )
	{
		return this.evaluado;
	}

	public void setEvaluado( Integer evaluado )
	{
		this.evaluado = evaluado;
	}

}
