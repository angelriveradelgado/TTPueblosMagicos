package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MunicipioId generated by hbm2java
 */
@Embeddable
public class MunicipioId implements java.io.Serializable
{

	private Integer idMunicipio;
	private Integer EIdEstado;

	public MunicipioId()
	{
	}

	public MunicipioId(Integer idMunicipio, Integer EIdEstado)
	{
		this.idMunicipio = idMunicipio;
		this.EIdEstado = EIdEstado;
	}

	@Column(name = "idMunicipio", nullable = false)
	public Integer getIdMunicipio( )
	{
		return this.idMunicipio;
	}

	public void setIdMunicipio( Integer idMunicipio )
	{
		this.idMunicipio = idMunicipio;
	}

	@Column(name = "e_idEstado", nullable = false)
	public Integer getEIdEstado( )
	{
		return this.EIdEstado;
	}

	public void setEIdEstado( Integer EIdEstado )
	{
		this.EIdEstado = EIdEstado;
	}

	public boolean equals( Object other )
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MunicipioId))
			return false;
		MunicipioId castOther = (MunicipioId) other;

		return (this.getIdMunicipio() == castOther.getIdMunicipio())
				&& (this.getEIdEstado() == castOther.getEIdEstado());
	}

	public int hashCode( )
	{
		int result = 17;

		result = 37 * result + this.getIdMunicipio();
		result = 37 * result + this.getEIdEstado();
		return result;
	}

}
