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
 * Horario generated by hbm2java
 */
@Entity
@Table(name = "horario", catalog = "pueblosMagicos")
public class Horario implements java.io.Serializable
{

	private Integer idHorario;
	private Date inicioTemporada;
	private Date finTemporada;
	private Date horaInicioLunes;
	private Date horaFinLunes;
	private Date horaInicioMartes;
	private Date horaFinMartes;
	private Date horaInicioMiercoles;
	private Date horaFinMiercoles;
	private Date horaInicioJueves;
	private Date horaFinJueves;
	private Date horaInicioViernes;
	private Date horaFinViernes;
	private Date horaInicioSabado;
	private Date horaFinSabado;
	private Date horaInicioDomingo;
	private Date horaFinDomingo;
	private Integer atIdAtractivoTuristico;
	private Integer stIdServicioTuristico;

	public Horario()
	{
	}

	public Horario(Date inicioTemporada, Date finTemporada, Date horaInicioLunes, Date horaFinLunes,
			Date horaInicioMartes, Date horaFinMartes, Date horaInicioMiercoles, Date horaFinMiercoles,
			Date horaInicioJueves, Date horaFinJueves, Date horaInicioViernes, Date horaFinViernes,
			Date horaInicioSabado, Date horaFinSabado, Date horaInicioDomingo, Date horaFinDomingo,
			Integer atIdAtractivoTuristico, Integer stIdServicioTuristico)
	{
		this.inicioTemporada = inicioTemporada;
		this.finTemporada = finTemporada;
		this.horaInicioLunes = horaInicioLunes;
		this.horaFinLunes = horaFinLunes;
		this.horaInicioMartes = horaInicioMartes;
		this.horaFinMartes = horaFinMartes;
		this.horaInicioMiercoles = horaInicioMiercoles;
		this.horaFinMiercoles = horaFinMiercoles;
		this.horaInicioJueves = horaInicioJueves;
		this.horaFinJueves = horaFinJueves;
		this.horaInicioViernes = horaInicioViernes;
		this.horaFinViernes = horaFinViernes;
		this.horaInicioSabado = horaInicioSabado;
		this.horaFinSabado = horaFinSabado;
		this.horaInicioDomingo = horaInicioDomingo;
		this.horaFinDomingo = horaFinDomingo;
		this.atIdAtractivoTuristico = atIdAtractivoTuristico;
		this.stIdServicioTuristico = stIdServicioTuristico;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idHorario", unique = true, nullable = false)
	public Integer getIdHorario( )
	{
		return this.idHorario;
	}

	public void setIdHorario( Integer idHorario )
	{
		this.idHorario = idHorario;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "inicioTemporada", length = 0)
	public Date getInicioTemporada( )
	{
		return this.inicioTemporada;
	}

	public void setInicioTemporada( Date inicioTemporada )
	{
		this.inicioTemporada = inicioTemporada;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "finTemporada", length = 0)
	public Date getFinTemporada( )
	{
		return this.finTemporada;
	}

	public void setFinTemporada( Date finTemporada )
	{
		this.finTemporada = finTemporada;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioLunes", length = 0)
	public Date getHoraInicioLunes( )
	{
		return this.horaInicioLunes;
	}

	public void setHoraInicioLunes( Date horaInicioLunes )
	{
		this.horaInicioLunes = horaInicioLunes;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinLunes", length = 0)
	public Date getHoraFinLunes( )
	{
		return this.horaFinLunes;
	}

	public void setHoraFinLunes( Date horaFinLunes )
	{
		this.horaFinLunes = horaFinLunes;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioMartes", length = 0)
	public Date getHoraInicioMartes( )
	{
		return this.horaInicioMartes;
	}

	public void setHoraInicioMartes( Date horaInicioMartes )
	{
		this.horaInicioMartes = horaInicioMartes;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinMartes", length = 0)
	public Date getHoraFinMartes( )
	{
		return this.horaFinMartes;
	}

	public void setHoraFinMartes( Date horaFinMartes )
	{
		this.horaFinMartes = horaFinMartes;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioMiercoles", length = 0)
	public Date getHoraInicioMiercoles( )
	{
		return this.horaInicioMiercoles;
	}

	public void setHoraInicioMiercoles( Date horaInicioMiercoles )
	{
		this.horaInicioMiercoles = horaInicioMiercoles;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinMiercoles", length = 0)
	public Date getHoraFinMiercoles( )
	{
		return this.horaFinMiercoles;
	}

	public void setHoraFinMiercoles( Date horaFinMiercoles )
	{
		this.horaFinMiercoles = horaFinMiercoles;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioJueves", length = 0)
	public Date getHoraInicioJueves( )
	{
		return this.horaInicioJueves;
	}

	public void setHoraInicioJueves( Date horaInicioJueves )
	{
		this.horaInicioJueves = horaInicioJueves;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinJueves", length = 0)
	public Date getHoraFinJueves( )
	{
		return this.horaFinJueves;
	}

	public void setHoraFinJueves( Date horaFinJueves )
	{
		this.horaFinJueves = horaFinJueves;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioViernes", length = 0)
	public Date getHoraInicioViernes( )
	{
		return this.horaInicioViernes;
	}

	public void setHoraInicioViernes( Date horaInicioViernes )
	{
		this.horaInicioViernes = horaInicioViernes;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinViernes", length = 0)
	public Date getHoraFinViernes( )
	{
		return this.horaFinViernes;
	}

	public void setHoraFinViernes( Date horaFinViernes )
	{
		this.horaFinViernes = horaFinViernes;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioSabado", length = 0)
	public Date getHoraInicioSabado( )
	{
		return this.horaInicioSabado;
	}

	public void setHoraInicioSabado( Date horaInicioSabado )
	{
		this.horaInicioSabado = horaInicioSabado;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinSabado", length = 0)
	public Date getHoraFinSabado( )
	{
		return this.horaFinSabado;
	}

	public void setHoraFinSabado( Date horaFinSabado )
	{
		this.horaFinSabado = horaFinSabado;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicioDomingo", length = 0)
	public Date getHoraInicioDomingo( )
	{
		return this.horaInicioDomingo;
	}

	public void setHoraInicioDomingo( Date horaInicioDomingo )
	{
		this.horaInicioDomingo = horaInicioDomingo;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFinDomingo", length = 0)
	public Date getHoraFinDomingo( )
	{
		return this.horaFinDomingo;
	}

	public void setHoraFinDomingo( Date horaFinDomingo )
	{
		this.horaFinDomingo = horaFinDomingo;
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

}
