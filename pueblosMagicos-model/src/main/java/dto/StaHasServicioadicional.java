package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * StaHasServicioadicional generated by hbm2java
 */
@Entity
@Table(name = "sta_has_servicioadicional", catalog = "pueblosMagicos")
public class StaHasServicioadicional implements java.io.Serializable {

	private StaHasServicioadicionalId id;

	public StaHasServicioadicional() {
	}

	public StaHasServicioadicional(StaHasServicioadicionalId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "staSTIdServicio", column = @Column(name = "sTA_sT_idServicio", nullable = false)),
			@AttributeOverride(name = "saIdservicioAdicional", column = @Column(name = "sA_idservicioAdicional", nullable = false)) })
	public StaHasServicioadicionalId getId() {
		return this.id;
	}

	public void setId(StaHasServicioadicionalId id) {
		this.id = id;
	}

}
