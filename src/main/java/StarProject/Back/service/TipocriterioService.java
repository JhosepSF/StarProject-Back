package StarProject.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StarProject.Back.entitys.Tipocriterio;
import StarProject.Back.repository.TipocriterioRepo;
import StarProject.Back.request.TipocriterioRequest;

@Service
public class TipocriterioService 
{
    @Autowired
    TipocriterioRepo tipocriterioRepo;

    public void nuevoTipocriterio(TipocriterioRequest tipocriterio)
    {
        Tipocriterio criterio = new Tipocriterio();
        criterio.setCriteryname(tipocriterio.getCriteryname());

        if (tipocriterio.getSubcriteryid() != null && tipocriterio.getSubcriteryid() != 0)
        {
            Tipocriterio subcritery = tipocriterioRepo.findById(tipocriterio.getSubcriteryid()).get();
            criterio.setSubcriteryid(subcritery);
        }
        else
        {
            criterio.setSubcriteryid(null);
        }
        
        tipocriterioRepo.save(criterio);
    }

    public List<Tipocriterio> getTipocriterios()
    {
        return tipocriterioRepo.findAll();
    }
    
    public Tipocriterio VerUnTipoCriterio(Integer id)
    {
        return tipocriterioRepo.findById(id).get();
    }
    
    public List<Tipocriterio> getTipocriterioMayor(Integer idcriterio)
    {
    	Tipocriterio tipocriterio = tipocriterioRepo.findById(idcriterio)
                .orElseThrow(()->new RuntimeException("No se encontro el criterio"));
    	
    	List<Tipocriterio> criterios = tipocriterioRepo.findBySubcriteryid(tipocriterio);
    	
    	return criterios;
    }
}
