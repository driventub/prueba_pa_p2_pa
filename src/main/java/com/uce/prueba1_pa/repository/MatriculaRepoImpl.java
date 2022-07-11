package com.uce.prueba1_pa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.prueba1_pa.modelo.Matricula;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

    @PersistenceContext
    private EntityManager e;

    @Override
    public void insertar(Matricula e) {
        this.e.persist(e);

    }

}
