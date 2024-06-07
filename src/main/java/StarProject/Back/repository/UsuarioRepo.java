package StarProject.Back.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import StarProject.Back.entitys.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>
{
	Optional <Usuario> findByUsername (String username);
}
