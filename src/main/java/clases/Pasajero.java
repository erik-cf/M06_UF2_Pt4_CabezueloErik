package clases;
// Generated 12-ene-2020 13:46:03 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pasajero generated by hbm2java
 */
@Entity
@Table(name = "pasajero", catalog = "pt4_reveng")
public class Pasajero implements java.io.Serializable {

	private short cod;
	private String nombre;
	private String tlf;
	private String direccion;
	private String pais;
	private Set<Pasaje> pasajes = new HashSet<Pasaje>(0);

	public Pasajero() {
	}

	public Pasajero(short cod) {
		this.cod = cod;
	}

	public Pasajero(short cod, String nombre, String tlf, String direccion, String pais, Set<Pasaje> pasajes) {
		this.cod = cod;
		this.nombre = nombre;
		this.tlf = tlf;
		this.direccion = direccion;
		this.pais = pais;
		this.pasajes = pasajes;
	}

	@Id

	@Column(name = "COD", unique = true, nullable = false)
	public short getCod() {
		return this.cod;
	}

	public void setCod(short cod) {
		this.cod = cod;
	}

	@Column(name = "NOMBRE", length = 30)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "TLF", length = 10)
	public String getTlf() {
		return this.tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Column(name = "DIRECCION", length = 40)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "PAIS", length = 15)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pasajero")
	public Set<Pasaje> getPasajes() {
		return this.pasajes;
	}

	public void setPasajes(Set<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

}
