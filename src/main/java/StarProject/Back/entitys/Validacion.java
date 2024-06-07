package StarProject.Back.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Validacion
{
	@Id
	@GeneratedValue
	Integer idvalidacion;
	
	@Column
	String validacion1;
	String validacion2;
	
	public Integer getIdvalidacion() {
		return idvalidacion;
	}
	public void setIdvalidacion(Integer idvalidacion) {
		this.idvalidacion = idvalidacion;
	}
	public String getValidacion1() {
		return validacion1;
	}
	public void setValidacion1(String validacion1) {
		this.validacion1 = validacion1;
	}
	public String getValidacion2() {
		return validacion2;
	}
	public void setValidacion2(String validacion2) {
		this.validacion2 = validacion2;
	}
}
