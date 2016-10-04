package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AsentamientoId generated by hbm2java
 */
@Embeddable
public class AsentamientoId implements java.io.Serializable
{

	private int idAsentamiento;
	private int MEIdEstado;
	private int MIdMunicipio;

	public AsentamientoId()
	{
	}

	public AsentamientoId(int idAsentamiento, int MEIdEstado, int MIdMunicipio)
	{
		this.idAsentamiento = idAsentamiento;
		this.MEIdEstado = MEIdEstado;
		this.MIdMunicipio = MIdMunicipio;
	}

	@Column(name = "idAsentamiento", nullable = false)
	public int getIdAsentamiento( )
	{
		return this.idAsentamiento;
	}

	public void setIdAsentamiento( int idAsentamiento )
	{
		this.idAsentamiento = idAsentamiento;
	}

	@Column(name = "m_e_idEstado", nullable = false)
	public int getMEIdEstado( )
	{
		return this.MEIdEstado;
	}

	public void setMEIdEstado( int MEIdEstado )
	{
		this.MEIdEstado = MEIdEstado;
	}

	@Column(name = "m_idMunicipio", nullable = false)
	public int getMIdMunicipio( )
	{
		return this.MIdMunicipio;
	}

	public void setMIdMunicipio( int MIdMunicipio )
	{
		this.MIdMunicipio = MIdMunicipio;
	}

	public boolean equals( Object other )
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AsentamientoId))
			return false;
		AsentamientoId castOther = (AsentamientoId) other;

		return (this.getIdAsentamiento() == castOther.getIdAsentamiento())
				&& (this.getMEIdEstado() == castOther.getMEIdEstado())
				&& (this.getMIdMunicipio() == castOther.getMIdMunicipio());
	}

	public int hashCode( )
	{
		int result = 17;

		result = 37 * result + this.getIdAsentamiento();
		result = 37 * result + this.getMEIdEstado();
		result = 37 * result + this.getMIdMunicipio();
		return result;
	}

}
