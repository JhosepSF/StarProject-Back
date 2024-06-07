package StarProject.Back.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import StarProject.Back.entitys.Cargo;

public interface CargoRepo extends JpaRepository<Cargo, Integer>
{
	Optional<Cargo> findByName(String name);
}
