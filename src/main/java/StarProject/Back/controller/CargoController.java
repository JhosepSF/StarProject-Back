package StarProject.Back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StarProject.Back.entitys.Cargo;
import StarProject.Back.request.CargoRequest;
import StarProject.Back.service.CargoService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cargo")
public class CargoController 
{
    @Autowired
    CargoService cargoService;
    
    @GetMapping("/cargos")
    public List<Cargo> vercargos()
    {
        return cargoService.vercargos();
    }

    @GetMapping("/cargo/{id}")
    public Cargo vercargo(@PathVariable Integer id)
    {
        return cargoService.vercargo(id);
    }

    @PostMapping("/nuevocargo")
    public void nuevocargo(@RequestBody CargoRequest cargo)
    {
        cargoService.nuevoCargo(cargo);
    }
}
