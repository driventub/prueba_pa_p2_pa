package com.uce.prueba1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.prueba1_pa.modelo.Matricula;
import com.uce.prueba1_pa.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

    @Autowired
    private IMatriculaRepo repo;

    @Override
    public void actualizar(Matricula c) {
        this.repo.actualizar(c);
        
    }

    @Override
    public Matricula buscar(String numero) {
        
        return this.repo.buscar(numero);
    }

    @Override
    public void ingresarMatricula(Matricula e) {
        this.repo.insertar(e);
        
    }

    @Override
    public void borrarMatricula(String numero) {
        this.repo.eliminar(numero);
        
    }
    
    
    
}
