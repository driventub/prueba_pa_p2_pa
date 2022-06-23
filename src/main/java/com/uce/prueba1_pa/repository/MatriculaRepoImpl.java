package com.uce.prueba1_pa.repository;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {

   

    @Override
    public void insertar(Matricula e) {
        System.out.println("Se ha insertado en la base " + e);

    }


}
