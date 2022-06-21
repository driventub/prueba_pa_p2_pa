package com.uce.prueba1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1_pa.modelo.Vehiculo;
import com.uce.prueba1_pa.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

    @Autowired
    private IVehiculoRepo repo;

    @Override
    public void actualizar(Vehiculo c) {
        this.repo.actualizar(c);
        
    }

    @Override
    public Vehiculo buscar(String placa) {
        
        return this.repo.buscar(placa);
    }

    @Override
    public void ingresarVehiculo(Vehiculo e) {
        this.repo.insertar(e);
        
    }

    @Override
    public void borrarVehiculo(String placa) {
        this.repo.eliminar(placa);
        
    }
    
    
    
}
