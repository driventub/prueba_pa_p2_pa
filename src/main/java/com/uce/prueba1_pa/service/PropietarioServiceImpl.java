package com.uce.prueba1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1_pa.modelo.Propietario;
import com.uce.prueba1_pa.repository.IPropietarioRepo;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

    @Autowired
    private IPropietarioRepo repo;

   

    @Override
    public void ingresarPropietario(Propietario e) {
        this.repo.insertar(e);
        
    }

    @Override
    public void borrarPropietario(String cedula) {
        this.repo.eliminar(cedula);
        
    }
    
    @Override
    public Propietario buscar(String cedula) {
        
        return this.repo.buscar(cedula);
    }
    
    
}
