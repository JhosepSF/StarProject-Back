package StarProject.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import StarProject.Back.entitys.Cargo;
import StarProject.Back.repository.CargoRepo;
import StarProject.Back.request.CargoRequest;

@Service
public class CargoService
{
    @Autowired
    CargoRepo cargorepo;

    public void nuevoCargo(CargoRequest cargoRequest)
    {
        Cargo cargo = new Cargo();

        cargo.setName(cargoRequest.getName());

        cargorepo.save(cargo);
    }

    public List<Cargo> vercargos()
    {
        return cargorepo.findAll();
    }

    public Cargo vercargo(Integer id)
    {
        return cargorepo.findById(id).get();
    }
}