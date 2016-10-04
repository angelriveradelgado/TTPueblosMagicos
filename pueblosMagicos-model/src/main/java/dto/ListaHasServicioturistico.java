package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ListaHasServicioturistico generated by hbm2java
 */
@Entity
@Table(name = "lista_has_servicioturistico", catalog = "pueblosMagicos")
public class ListaHasServicioturistico implements java.io.Serializable
{

	private ListaHasServicioturisticoId id;

	public ListaHasServicioturistico()
	{
	}

	public ListaHasServicioturistico(ListaHasServicioturisticoId id)
	{
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "listaIdlista", column = @Column(name = "lista_idlista", nullable = false)),
			@AttributeOverride(name = "servicioTuristicoIdServicio", column = @Column(name = "servicioTuristico_idServicio", nullable = false)),
			@AttributeOverride(name = "turistaIdUsuario", column = @Column(name = "Turista_idUsuario", nullable = false)) })
	public ListaHasServicioturisticoId getId( )
	{
		return this.id;
	}

	public void setId( ListaHasServicioturisticoId id )
	{
		this.id = id;
	}

}