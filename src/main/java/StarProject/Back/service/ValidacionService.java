package StarProject.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StarProject.Back.entitys.Validacion;
import StarProject.Back.repository.ValidacionesRepo;

@Service
public class ValidacionService 
{
	@Autowired
	ValidacionesRepo valirepo;
	
	public void nuevavalidacion (Validacion validacion) 
	{
		valirepo.save(validacion);
	}
	
	public List<Validacion> getValidaciones ()
	{
		return valirepo.findAll();
	}
	
	public Validacion getValidacionById(Integer id) 
	{
		return valirepo.findById(id).orElseThrow(()-> new RuntimeException ("No se encontre el id"));
	}
}
