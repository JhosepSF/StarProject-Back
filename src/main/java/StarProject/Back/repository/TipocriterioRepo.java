package StarProject.Back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import StarProject.Back.entitys.Tipocriterio;

public interface TipocriterioRepo extends JpaRepository<Tipocriterio, Integer>
{
	List<Tipocriterio> findByCriteriosuperior(Tipocriterio criterio);
}
