package StarProject.Back.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import StarProject.Back.entitys.Usuario;
import StarProject.Back.repository.UsuarioRepo;
import StarProject.Back.request.AuthResponse;
import StarProject.Back.request.LoginRequest;


@Service
public class AuthService 
{	
	private final UsuarioRepo usuario;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	public AuthService(UsuarioRepo usuario, JwtService jwtService, AuthenticationManager authenticationManager) {
		super();
		this.usuario = usuario;
		this.jwtService = jwtService;
		this.authenticationManager = authenticationManager;
	}

	public AuthResponse login(LoginRequest request) 
	{
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		Usuario usua = usuario.findByUsername(request.getUsername()).orElseThrow();
		AuthResponse authResponse = new AuthResponse();
	    authResponse.setToken(jwtService.getToken((UserDetails) usua));
	    return authResponse; 
	}
}
