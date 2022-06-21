package com.uce.prueba1_pa.repository;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {

    @Override
    public void actualizar(Matricula c) {
        
        System.out.println("Matricula actualizada a: " + c);

    }

    @Override
    public Matricula buscar(String numero) {
        System.out.println("Se busca la matricula :" + numero);
        Matricula c = new Matricula();
      
        return c;
    }

    @Override
    public void insertar(Matricula e) {
        System.out.println("Se ha insertado en la base " + e);

    }

    @Override
    public void eliminar(String numero) {
        System.out.println("Se ha eliminado de la base " + numero);

    }

}
