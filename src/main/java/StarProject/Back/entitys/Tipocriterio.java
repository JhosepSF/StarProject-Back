package StarProject.Back.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tipocriterio 
{
	@Id
	@GeneratedValue
	Integer idcriterio;
	
	@Column
	String nombrecriterio;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subcriteryid")
    Tipocriterio criteriosuperior;

	public Integer getIdcriterio() {
		return idcriterio;
	}

	public void setIdcriterio(Integer idcriterio) {
		this.idcriterio = idcriterio;
	}

	public String getNombrecriterio() {
		return nombrecriterio;
	}

	public void setNombrecriterio(String nombrecriterio) {
		this.nombrecriterio = nombrecriterio;
	}

	public Tipocriterio getCriteriosuperior() {
		return criteriosuperior;
	}

	public void setCriteriosuperior(Tipocriterio criteriosuperior) {
		this.criteriosuperior = criteriosuperior;
	}
}
