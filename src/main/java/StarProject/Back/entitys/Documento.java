package StarProject.Back.entitys;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Documento 
{
	@Id
	String nrodoc;
	
	@Column
	String titulo;
	String estado;
	LocalDate fecha;
	Integer duracion;
	LocalDate vencimiento;
	String valorlegal;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name= "idvalidacion")
	Validacion idvalidacion;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name= "idusuario")
	Usuario idusuario;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name= "idtipocriterio")
	Tipocriterio idtipocriterio;

	@Lob
	@Column(name = "pdf", columnDefinition = "LONGBLOB")
	byte[] pdf;
	
	public String getNrodoc() {
		return nrodoc;
	}
	public void setNrodoc(String doc) {
		this.nrodoc = doc;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {							
		this.fecha = fecha;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public LocalDate getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}
	public Tipocriterio getIdtipocriterio() {
		return idtipocriterio;
	}
	public void setIdtipocriterio(Tipocriterio idtipocriterio) {
		this.idtipocriterio = idtipocriterio;
	}
	public byte[] getPdf() {
		return pdf;
	}
	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	public String getValorlegal() {
		return valorlegal;
	}
	public void setValorlegal(String valorlegal) {
		this.valorlegal = valorlegal;
	}
	public Validacion getIdvalidacion() {
		return idvalidacion;
	}
	public void setIdvalidacion(Validacion idvalidacion) {
		this.idvalidacion = idvalidacion;
	}
}
