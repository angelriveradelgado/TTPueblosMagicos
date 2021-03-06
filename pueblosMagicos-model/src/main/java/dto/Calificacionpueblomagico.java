package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Calificacionpueblomagico generated by hbm2java
 */
@Entity
@Table(name = "calificacionpueblomagico", catalog = "pueblosMagicos")
public class Calificacionpueblomagico implements java.io.Serializable
{

	private Integer idCalificacion;
	private Integer calificacion;
	private String comentario;
	private Integer TIdUsuario;
	private Integer pmIdPuebloMagico;

	public Calificacionpueblomagico()
	{
	}

	public Calificacionpueblomagico(Integer TIdUsuario, Integer pmIdPuebloMagico)
	{
		this.TIdUsuario = TIdUsuario;
		this.pmIdPuebloMagico = pmIdPuebloMagico;
	}

	public Calificacionpueblomagico(Integer calificacion, String comentario, Integer TIdUsuario, Integer pmIdPuebloMagico)
	{
		this.calificacion = calificacion;
		this.comentario = comentario;
		this.TIdUsuario = TIdUsuario;
		this.pmIdPuebloMagico = pmIdPuebloMagico;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCalificacion", unique = true, nullable = false)
	public Integer getIdCalificacion( )
	{
		return this.idCalificacion;
	}

	public void setIdCalificacion( Integer idCalificacion )
	{
		this.idCalificacion = idCalificacion;
	}

	@Column(name = "calificacion")
	public Integer getCalificacion( )
	{
		return this.calificacion;
	}

	public void setCalificacion( Integer calificacion )
	{
		this.calificacion = calificacion;
	}

	@Column(name = "comentario", length = 65535)
	public String getComentario( )
	{
		return this.comentario;
	}

	public void setComentario( String comentario )
	{
		this.comentario = comentario;
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

	@Column(name = "pM_idPuebloMagico", nullable = false)
	public Integer getPmIdPuebloMagico( )
	{
		return this.pmIdPuebloMagico;
	}

	public void setPmIdPuebloMagico( Integer pmIdPuebloMagico )
	{
		this.pmIdPuebloMagico = pmIdPuebloMagico;
	}

}
