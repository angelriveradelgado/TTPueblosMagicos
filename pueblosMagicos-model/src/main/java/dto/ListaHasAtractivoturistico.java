package dto;
// Generated 29/09/2016 02:45:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ListaHasAtractivoturistico generated by hbm2java
 */
@Entity
@Table(name = "lista_has_atractivoturistico", catalog = "pueblosMagicos")
public class ListaHasAtractivoturistico implements java.io.Serializable
{

	private ListaHasAtractivoturisticoId id;

	public ListaHasAtractivoturistico()
	{
	}

	public ListaHasAtractivoturistico(ListaHasAtractivoturisticoId id)
	{
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "listaIdlista", column = @Column(name = "lista_idlista", nullable = false)),
			@AttributeOverride(name = "atractivoTuristicoIdAtractivoTuristico", column = @Column(name = "AtractivoTuristico_idAtractivoTuristico", nullable = false)),
			@AttributeOverride(name = "turistaIdUsuario", column = @Column(name = "Turista_idUsuario", nullable = false)) })
	public ListaHasAtractivoturisticoId getId( )
	{
		return this.id;
	}

	public void setId( ListaHasAtractivoturisticoId id )
	{
		this.id = id;
	}

}
