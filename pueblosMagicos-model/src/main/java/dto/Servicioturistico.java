package dto;
// Generated 30/08/2016 02:54:23 PM by Hibernate Tools 5.1.0.Beta1

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
 * Servicioturistico generated by hbm2java
 */
@Entity
@Table(name = "servicioturistico", catalog = "pueblosMagicos")
public class Servicioturistico implements java.io.Serializable {

	private Integer idServicioTuristico;
	private int EIdEstablecimiento;
	private String nombre;
	private int aforo;
	private Date horaInicio;
	private Date horaFin;
	private int tstIdtSt;
	private int VIdUsuario;
	private double precioMinimo;
	private double precioMáximo;
	private double precioMedio;
	private int estIdevaluacion;
	private int erstIdeRst;
	private String descripcion;
	private String sitioWeb;

	public Servicioturistico() {
	}

	public Servicioturistico(int EIdEstablecimiento, String nombre, int aforo, Date horaInicio, Date horaFin,
			int tstIdtSt, int VIdUsuario, double precioMinimo, double precioMáximo, double precioMedio,
			int estIdevaluacion, int erstIdeRst, String descripcion) {
		this.EIdEstablecimiento = EIdEstablecimiento;
		this.nombre = nombre;
		this.aforo = aforo;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.tstIdtSt = tstIdtSt;
		this.VIdUsuario = VIdUsuario;
		this.precioMinimo = precioMinimo;
		this.precioMáximo = precioMáximo;
		this.precioMedio = precioMedio;
		this.estIdevaluacion = estIdevaluacion;
		this.erstIdeRst = erstIdeRst;
		this.descripcion = descripcion;
	}

	public Servicioturistico(int EIdEstablecimiento, String nombre, int aforo, Date horaInicio, Date horaFin,
			int tstIdtSt, int VIdUsuario, double precioMinimo, double precioMáximo, double precioMedio,
			int estIdevaluacion, int erstIdeRst, String descripcion, String sitioWeb) {
		this.EIdEstablecimiento = EIdEstablecimiento;
		this.nombre = nombre;
		this.aforo = aforo;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.tstIdtSt = tstIdtSt;
		this.VIdUsuario = VIdUsuario;
		this.precioMinimo = precioMinimo;
		this.precioMáximo = precioMáximo;
		this.precioMedio = precioMedio;
		this.estIdevaluacion = estIdevaluacion;
		this.erstIdeRst = erstIdeRst;
		this.descripcion = descripcion;
		this.sitioWeb = sitioWeb;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idServicioTuristico", unique = true, nullable = false)
	public Integer getIdServicioTuristico() {
		return this.idServicioTuristico;
	}

	public void setIdServicioTuristico(Integer idServicioTuristico) {
		this.idServicioTuristico = idServicioTuristico;
	}

	@Column(name = "e_idEstablecimiento", nullable = false)
	public int getEIdEstablecimiento() {
		return this.EIdEstablecimiento;
	}

	public void setEIdEstablecimiento(int EIdEstablecimiento) {
		this.EIdEstablecimiento = EIdEstablecimiento;
	}

	@Column(name = "nombre", nullable = false, length = 80)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "aforo", nullable = false)
	public int getAforo() {
		return this.aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaInicio", nullable = false, length = 8)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "horaFin", nullable = false, length = 8)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	@Column(name = "tST_idtST", nullable = false)
	public int getTstIdtSt() {
		return this.tstIdtSt;
	}

	public void setTstIdtSt(int tstIdtSt) {
		this.tstIdtSt = tstIdtSt;
	}

	@Column(name = "v_idUsuario", nullable = false)
	public int getVIdUsuario() {
		return this.VIdUsuario;
	}

	public void setVIdUsuario(int VIdUsuario) {
		this.VIdUsuario = VIdUsuario;
	}

	@Column(name = "precioMinimo", nullable = false, precision = 22, scale = 0)
	public double getPrecioMinimo() {
		return this.precioMinimo;
	}

	public void setPrecioMinimo(double precioMinimo) {
		this.precioMinimo = precioMinimo;
	}

	@Column(name = "precioMáximo", nullable = false, precision = 22, scale = 0)
	public double getPrecioMáximo() {
		return this.precioMáximo;
	}

	public void setPrecioMáximo(double precioMáximo) {
		this.precioMáximo = precioMáximo;
	}

	@Column(name = "precioMedio", nullable = false, precision = 22, scale = 0)
	public double getPrecioMedio() {
		return this.precioMedio;
	}

	public void setPrecioMedio(double precioMedio) {
		this.precioMedio = precioMedio;
	}

	@Column(name = "eST_idevaluacion", nullable = false)
	public int getEstIdevaluacion() {
		return this.estIdevaluacion;
	}

	public void setEstIdevaluacion(int estIdevaluacion) {
		this.estIdevaluacion = estIdevaluacion;
	}

	@Column(name = "eRST_ideRST", nullable = false)
	public int getErstIdeRst() {
		return this.erstIdeRst;
	}

	public void setErstIdeRst(int erstIdeRst) {
		this.erstIdeRst = erstIdeRst;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "sitioWEB", length = 45)
	public String getSitioWeb() {
		return this.sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

}
