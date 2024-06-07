package StarProject.Back.request;

public class TipocriterioRequest 
{
	String nombrecriterio;
    Integer criteriosuperior;
    
	public String getNombrecriterio() {
		return nombrecriterio;
	}
	public void setNombrecriterio(String nombrecriterio) {
		this.nombrecriterio = nombrecriterio;
	}
	public Integer getCriteriosuperior() {
		return criteriosuperior;
	}
	public void setCriteriosuperior(Integer criteriosuperior) {
		this.criteriosuperior = criteriosuperior;
	}
}