package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TipoturismoHasTiposervicioturistico generated by hbm2java
 */
@Entity
@Table(name = "tipoturismo_has_tiposervicioturistico", catalog = "pueblosMagicos")
public class TipoturismoHasTiposervicioturistico implements java.io.Serializable
{

	private TipoturismoHasTiposervicioturisticoId id;

	public TipoturismoHasTiposervicioturistico()
	{
	}

	public TipoturismoHasTiposervicioturistico(TipoturismoHasTiposervicioturisticoId id)
	{
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "stIdtipoTurismo", column = @Column(name = "sT_idtipoTurismo", nullable = false)),
			@AttributeOverride(name = "tstIdtipoServicioTuristico", column = @Column(name = "tST_idtipoServicioTuristico", nullable = false)) })
	public TipoturismoHasTiposervicioturisticoId getId( )
	{
		return this.id;
	}

	public void setId( TipoturismoHasTiposervicioturisticoId id )
	{
		this.id = id;
	}

}
