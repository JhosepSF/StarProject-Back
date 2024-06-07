package StarProject.Back.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StarProject.Back.repository.UsuarioRepo;
import StarProject.Back.request.AuthResponse;
import StarProject.Back.request.LoginRequest;
import StarProject.Back.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class AuthRestController 
{
	private final AuthService authService;
	private final UsuarioRepo usuarioRepository;
	
	public AuthRestController(AuthService authService, UsuarioRepo usuarioRepo) 
	{
		super();
		this.authService = authService;
		this.usuarioRepository = usuarioRepo;
	}
	
	@PostMapping("/login")
	public ResponseEntity <AuthResponse> login(@RequestBody LoginRequest request)
	{
		return ResponseEntity.ok(authService.login(request));
	}

	public UsuarioRepo getUsuarioRepository() {
		return usuarioRepository;
	}
	
	@PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request)
	{
        try 
        {
            request.getSession().invalidate();
            return ResponseEntity.ok().body("{\"message\": \"Sesión cerrada con éxito.\"}");
        } 
        catch (Exception e) 
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al cerrar la sesión: " + e.getMessage());
        }
    }
}