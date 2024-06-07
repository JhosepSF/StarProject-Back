package StarProject.Back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import StarProject.Back.entitys.Documento;
import StarProject.Back.entitys.Tipocriterio;

public interface DocumentoRepo extends JpaRepository<Documento, String>
{
	List<Documento> findByIdtipocriterio(Tipocriterio criterio);
}
