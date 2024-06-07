package StarProject.Back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StarProject.Back.entitys.Validacion;
import StarProject.Back.service.ValidacionService;

@RestController
@RequestMapping("/validacion")
public class ValidacionController
{
	@Autowired
	ValidacionService valiservice;
	
	@PostMapping("/nuevavalidacion")
	public void nuevavalidacion (@RequestBody Validacion validacion)
	{
		valiservice.nuevavalidacion(validacion);
	}

	@GetMapping("/getValidaciones")
	public List<Validacion> getValidaciones()
	{
		return valiservice.getValidaciones();
	}

	@GetMapping("/getValidacion/{id}")
	public Validacion getValidacion(@PathVariable int id)
	{
		return valiservice.getValidacionById(id);
	}
}
