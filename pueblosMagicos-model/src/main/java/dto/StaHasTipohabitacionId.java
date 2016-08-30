package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StaHasTipohabitacionId generated by hbm2java
 */
@Embeddable
public class StaHasTipohabitacionId implements java.io.Serializable {

	private int staSTIdServicio;
	private int thIdtH;

	public StaHasTipohabitacionId() {
	}

	public StaHasTipohabitacionId(int staSTIdServicio, int thIdtH) {
		this.staSTIdServicio = staSTIdServicio;
		this.thIdtH = thIdtH;
	}

	@Column(name = "sTA_sT_idServicio", nullable = false)
	public int getStaSTIdServicio() {
		return this.staSTIdServicio;
	}

	public void setStaSTIdServicio(int staSTIdServicio) {
		this.staSTIdServicio = staSTIdServicio;
	}

	@Column(name = "tH_idtH", nullable = false)
	public int getThIdtH() {
		return this.thIdtH;
	}

	public void setThIdtH(int thIdtH) {
		this.thIdtH = thIdtH;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StaHasTipohabitacionId))
			return false;
		StaHasTipohabitacionId castOther = (StaHasTipohabitacionId) other;

		return (this.getStaSTIdServicio() == castOther.getStaSTIdServicio())
				&& (this.getThIdtH() == castOther.getThIdtH());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStaSTIdServicio();
		result = 37 * result + this.getThIdtH();
		return result;
	}

}
